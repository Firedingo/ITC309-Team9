import React from 'react';
import {View, Text, StyleSheet} from 'react-native';

const WaterSensorListScreen = ({ route, navigation }) => {
    return(
        <View style={styles.screen}>
            <Text>Water Sensor List Screen</Text>
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

export default WaterSensorListScreen;