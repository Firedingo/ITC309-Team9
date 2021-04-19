// Imports the necessary React components.
import React, {useEffect, useState} from "react";
import {StyleSheet, Text, View} from "react-native";

// Imports the configuration required for the third-party APIs.
// For security purposes, the final application will utilise an intermediary API to obfuscate the client credentials.
import config from "./config";

// Defines and renders the main component.
const App = () => {
    return <HarvestZoneData />;
};

// Requests a bearer access token from the FarmDecisionTech API.
const requestAccessToken = () => {
    // Configures the request options.
    const requestOptions = {
        "method": "POST",
        "headers": {
            "accept": "application/json",
            "content-type": "application/x-www-form-urlencoded"
        },
        "body": `client_id=${encodeURIComponent(config.farmDecisionTech.clientId)}&client_secret=${encodeURIComponent(config.farmDecisionTech.clientSecret)}&grant_type=client_credentials`
    };

    // Sends the request.
    return fetch(`${config.farmDecisionTech.baseUrl}/token.php`, requestOptions)
        .then(response => {
            // Determines if the HTTP status code of the response was not 200 (i.e. OK).
            if (!response.ok)
                throw new Error("Unable to retrieve the bearer access token.");

            // Returns the response body as parsed JSON (i.e. an object).
            return response.json();
        })
        .then(responseBody => responseBody.access_token);
};

// Requests the list of harvest zones for Clyde River.
const requestHarvestZoneData = () => {
    // Requests the bearer access token.
    return requestAccessToken()
        .then(accessToken => {
            // Configures the request options.
            const requestOptions = {
                "headers": {
                    "accept": "application/json",
                    "authorization": `Bearer ${accessToken}`
                }
            };

            // Sends the request.
            return fetch(`${config.farmDecisionTech.baseUrl}/tenant/assets?limit=${config.farmDecisionTech.recordLimit}&type=Zone`, requestOptions);
        })
        .then(response => {
            // Determines if the HTTP status code of the response was not 200 (i.e. OK).
            if (!response.ok)
                throw new Error("Unable to retrieve the harvest zone data.");

            // Returns the response body as parsed JSON (i.e. an object).
            return response.json();
        });
};

// Defines and renders the harvest zone data component.
const HarvestZoneData = () => {
    // Sets the initial state indicating that the component data requires loading.
    const [isLoading, setIsLoading] = useState(true);

    // Sets the initial (i.e. empty) state of the component data.
    const [data, setData] = useState([]);

    // Ensures that the "side-effect" runs post-render (i.e. DOM updates have been flushed).
    useEffect(() => {
        // Requests the list of harvest zones and updates the state of the component data.
        requestHarvestZoneData()
            .then(responseBody => setData(responseBody.data))
            .catch(error => console.error(error))
            .finally(() => setIsLoading(false));
    }, []);

    // Returns the component based on the internal state.
    return (
        <View style={styles.container}>
            {isLoading ? <Text style={styles.prompt}>Loading Data</Text> : data.map(element => <Text key={element.name} style={styles.item}>{element.name}</Text>)}
        </View>
    );
};

// Defines the component styles.
const styles = StyleSheet.create({
    "container": {
        "alignItems": "center",
        "backgroundColor": "#eee",
        "flex": 1,
        "justifyContent": "center"
    },
    "item": {
        "borderBottomColor": "#aaa",
        "borderBottomStyle": "dashed",
        "borderBottomWidth": 1,
        "color": "#333",
        "fontSize": 16,
        "padding": 12
    },
    "prompt": {
        "color": "#666",
        "fontSize": 20,
        "fontWeight": "bold"
    }
});

// Exports the main component.
export default App;