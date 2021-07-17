import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

import EstuariesNavigator from './routes/EstuariesNavigator';
import Header from './shared/Header';

export default function App() {
  return (
    <EstuariesNavigator />
    // <View style={styles.screen}>
    //   <Header title='Clyde River' />
    //   <LocationScreen></LocationScreen>
    // </View>
  );
}

const styles = StyleSheet.create({
  screen: {
    flex: 1,
  }
});
