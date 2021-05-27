import React from 'react';
import {View, Text, StyleSheet} from 'react-native';

const RainfallScreen = ({ route, navigation }) => {
    return(
        <View style={styles.screen}>
            <Text>Rainfall Screen</Text>
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

export default RainfallScreen;