import React, { useState} from 'react';
import {View, Text, StyleSheet, Button, FlatList, TouchableOpacity} from 'react-native';
import Card from '../shared/Card';

const DUMMY_DATA = [
    {
        id: '123', 
        title: 'Clyde River', 
        isFavorite: true,
    },
    {
        id: '456', 
        title: 'Sydney Harbor', 
        isFavorite: false,
    },
    {
        id: '789', 
        title: 'Some other River', 
        isFavorite: false,
    },
];





const SelectLocationScreen = ({ navigation }) => {

    const [locations, setLocations] = useState(DUMMY_DATA);

    const addLocation = (id, title, isFavorite) => {
        setLocations(
        currentLocations => [...locations, 
          {id: id, title: title, isFavorite: isFavorite}
        ]);
    }

    return(
        <View style={styles.screen}>            
            <FlatList
                keyExtractor={(item, index) => index.toString()}
                data={locations}
                renderItem={({ item }) => (
                    <Card key={item.id}>
                        <TouchableOpacity onPress={() => {
                            navigation.navigate('LocationScreen', { id: item.id, title: item.title});
                        }}>
                        <Text>{item.title}</Text>
                        </TouchableOpacity>
                    </Card>
                )}
            />
        </View>
    )
}


const styles = StyleSheet.create({
    screen: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
    }
});

export default SelectLocationScreen;

