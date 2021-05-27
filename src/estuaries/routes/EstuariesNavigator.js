import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

import SelectLocationScreen from '../screens/SelectLocationScreen';
import LocationScreen from '../screens/LocationScreen';
import RainfallScreen from '../screens/RainfallScreen';
import HarvestAreaScreen from '../screens/HarvestAreaScreen';
import WaterSensorListScreen from '../screens/WaterSensorListScreen';
import WindScreen from '../screens/WindScreen';

const Stack = createStackNavigator();

function EstuariesStack() {
  return (
    <Stack.Navigator
      initialRouteName="SelectLocationScreen"
      screenOptions={{
        headerStyle: {
          backgroundColor: '#063f5c',
        },
        headerTintColor: 'white',
        headerTitleStyle: {
          fontWeight: 'bold',
        },
        gestureEnabled: false 
      }}
    >
      <Stack.Screen
        name="SelectLocationScreen"
        component={SelectLocationScreen}
        options={{ title: 'Select Location' }}
      />
      <Stack.Screen
        name="LocationScreen"
        component={LocationScreen}
        options={({ route }) => ({ title: route.params.title })}
      />
      <Stack.Screen
        name="RainfallScreen"
        component={RainfallScreen}
        options={({ route }) => ({ title: route.params.title + ' Rainfall' })}
      />
      <Stack.Screen
        name="HarvestAreaScreen"
        component={HarvestAreaScreen}
        options={({ route }) => ({ title: route.params.title})}
      />
      <Stack.Screen
        name="WaterSensorListScreen"
        component={WaterSensorListScreen}
        options={{ title: 'Water Quality Sensors' }}
      />
      <Stack.Screen
        name="WindScreen"
        component={WindScreen}
        options={({ route }) => ({ title: route.params.title + ' Wind' })}
      />
    </Stack.Navigator>
  );
}

function EstuariesNavigator() {
    return (
        <NavigationContainer>
            {EstuariesStack()}
        </NavigationContainer>
    );
}

export default EstuariesNavigator;