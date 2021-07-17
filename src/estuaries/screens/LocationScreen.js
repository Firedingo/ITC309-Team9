import React, {useState} from 'react';
import { View, Text, StyleSheet, Dimensions, Image, TouchableOpacity } from 'react-native';
import Card from '../shared/Card';

import MasonryList from '@react-native-seoul/masonry-list';

const DataType = Object.freeze({
    rainfall: 1,
    harvestArea: 2,
    salinity: 3,
    wind: 4,
});

const AreaStatus = Object.freeze({
    closed: 0,
    open: 1,
})

const DUMMY_DATA = [
    {
        id: 1,
        type: DataType.rainfall,
        limits: [
            {id: '24hr', rainfall: 12, limit: 50, label: '24 hours'},
            {id: '7days', rainfall: 38, limit: 450, label: '7 days'},
        ]
    },
    {
        id: 2,
        type: DataType.harvestArea,
        areaName: 'Rocky Point',
        areaStatus: AreaStatus.open,
        reason: '',
    },
    {
        id: 3,
        type: DataType.harvestArea,
        areaName: 'Waterfall',
        areaStatus: AreaStatus.closed,
        reason: 'Sewerage Leak',
    },
    {
        id: 4,
        type: DataType.harvestArea,
        areaName: 'Moonlight',
        areaStatus: AreaStatus.open,
        reason: '',
    },
    {
        id: 5,
        type: DataType.salinity,
        image: '../assets/examplegraph.png',
    },
];

const LocationScreen = ({ route, navigation }) => {

    function renderItem(itemData) {
        switch(itemData.type) {
            case DataType.rainfall:
                return renderRainfall(itemData);
                break;
            case DataType.harvestArea:
                return renderHarvestArea(itemData);
                break;
            case DataType.salinity:
                return renderSalinity(itemData);
                break;
            case DataType.wind:
                return renderWind(itemData);
                break;
        }
    }
    
    function renderRainfall(props) {
        return <TouchableOpacity
                    onPress={() => navigation.navigate('RainfallScreen', {id: route.params.id, title: route.params.title})}>
                    <Text style={styles.cardTitle}>Rainfall</Text>
                    {props.limits.map((limit, index) => 
                        <View key={index}>
                            <Text>{limit.rainfall + 'ml in the last ' + limit.label + ' (limit is ' + limit.limit + 'ml)'}</Text>
                        </View>)}
                </TouchableOpacity>
    }
    
    function renderHarvestArea(props) {
        return <TouchableOpacity
                    onPress={() => navigation.navigate('HarvestAreaScreen', {id: route.params.id, title: props.areaName})}>
                    <Text style={styles.cardTitle}>{props.areaName}</Text>
                    <Text>{(props.areaStatus == AreaStatus.open) ? 'Open' : 'Closed'}</Text>
                </TouchableOpacity>
    }
    
    function renderSalinity(props) {
        return <TouchableOpacity
                    onPress={() => navigation.navigate('WaterSensorListScreen', {id: route.params.id})}>
                    <Text style={styles.cardTitle}>Salinity</Text>
                    <Image source={require('../assets/examplegraph.png')} 
                    style={styles.image}
                    resizeMode='cover'
                    />
                </TouchableOpacity>
    }
    
    function renderWind(props) {
        return <TouchableOpacity
                    onPress={() => navigation.navigate('WindScreen', {id: route.params.id})}>
                    <Text style={styles.cardTitle}>Wind</Text>
                    <Text>{props.type}</Text>
                </TouchableOpacity>
    }
    
    function calculateLayoutColumns() {
        let width = Dimensions.get('window').width;
        if (width > 400) {
            return 2;
        }
        return 1;
    }



    const [layoutColumns, setLayoutColumns] = useState(calculateLayoutColumns());

    const updateLayout = () => {
        setLayoutColumns(calculateLayoutColumns());
    }

    Dimensions.addEventListener('change', updateLayout);

    return <View style={styles.screen}>
        <MasonryList
            data={DUMMY_DATA}
            numColumns={layoutColumns}
            renderItem={itemData => <Card key={itemData.item.id}>
                {renderItem(itemData.item)}
          </Card> }
        />
    </View>
}

const styles = StyleSheet.create({
    screen: {
        flex: 1,
        padding: 10,
        alignItems: 'center',
    },
    image: {
        width: '100%',
        margin: 4,
    },
    cardTitle: {
        fontSize: 16,
        fontWeight: 'bold',
        marginBottom: 2,
    }
});

export default LocationScreen;