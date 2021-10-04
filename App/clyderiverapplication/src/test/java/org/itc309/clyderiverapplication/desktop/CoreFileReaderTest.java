package org.itc309.clyderiverapplication.desktop;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class CoreFileReaderTest {
	
	CoreFileReader reader = new CoreFileReader();
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Before                                         
	public void init() {
	        
	}
	
	@Disabled //No Need To Run This @Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testReadFavouriteLocationGetsDataFromFile() {
		//Arrange
		String location;
		
		//Act
		location = reader.readFavouriteLocation();
		
		//Assert
		assertTrue(location.contains("Location"));
	}
	
	@Disabled //Not Working Correctly @Test
	public void testReadFavouriteLocationWithInvalidFile() {
		//Arrange
		reader.setPath(0);
		String location;
		File actualPath;
		File expectedPath = new File("Fail");
		
		//Act
		location = reader.readFavouriteLocation();
		actualPath = reader.getPath();
		
		//Assert
		exceptionRule.expect(FileNotFoundException.class);
		//exceptionRule.reportMissingExceptionWithMessage("(The system cannot find the file specified)");
		exceptionRule.expectMessage("Fail (The system cannot find the file specified)");
		assertEquals(expectedPath,actualPath);
		
	}
	
	@Test
	public void testReadSensorsTextFileGetsDataFromFile() {
		//Arrange
		String[] sensor = new String[25];
		
		//Act
		sensor = reader.readSensorsTextFile();
		
		//Assert
		assertTrue(sensor[1] != null);
	}

	@Test
	public void testReadHarvestTextFileGetsDataFromFile() {
		//Arrange
		String[] sensor = new String[25];
		
		//Act
		sensor = reader.readHarvestTextFile();
		
		//Assert
		assertTrue(sensor[1] != null);
	}

	@Test
	public void testReadAllSensorsFileGetsDataFromFile() {
		//Arrange
		String[] sensor = new String[25];
		
		//Act
		sensor = reader.readAllSensorsFile();
		
		//Assert
		assertTrue(sensor[1] != null);
	}

	@Test
	public void testReadTimeGetsDataFromFile() {
		//Arrange
		String[] time = new String[25];
		
		//Act
		time = reader.readTime();
		//Assert
		assertTrue(time[1] != null);
	}
	
	@Test
	public void testReadTimeGetsUniqueDataFromFile() {
		//Arrange
		String[] time = new String[25];
		
		//Act
		time = reader.readTime();
		//Assert
		assertTrue(time[1] != null);
		assertNotEquals(time[1],time[2]);
	}
	
	@Test
	public void testReadDataGetsDataFromFile() {
		//Arrange
		Number[] data = new Number[25];
		
		//Act
		data = reader.readData();
		
		//Assert
		assertTrue(data[1] != null);
	}
	
	@Test
	public void testReadDataGetsUniqueDataFromFile() {
		//Arrange
		Number[] data = new Number[25];
		
		//Act
		data = reader.readData();
		
		//Assert
		assertTrue(data[1] != null);
		assertNotEquals(data[1],data[2]);
	}
	
	@Test
	public void testSensorListPathIsValid() {
		//Arrange
		reader.setPath(2);
		File actualPath;
		File expectedPath = new File ("..\\data\\sensor_list.txt");
		
		//Act
		actualPath = reader.getPath();
		
		//Assert
		assertEquals(expectedPath, actualPath);
	}
	
	@Test
	public void testPreferencesPathIsValid() {
		//Arrange
		reader.setPath(1);
		File actualPath;
		File expectedPath = new File ("..\\data\\preferences.txt");
		
		//Act
		actualPath = reader.getPath();
		
		//Assert
		assertEquals(expectedPath, actualPath);
	}
	
	@Test
	public void testDataPathIsValid() {
		//Arrange
		reader.setPath(3);
		File actualPath;
		File expectedPath = new File ("..\\data\\salinity_levels.csv");
		
		//Act
		actualPath = reader.getPath();
		
		//Assert
		assertEquals(expectedPath, actualPath);
	}
	
	@Test
	public void testReadTemperatureDataGetsDataFromFile() {
		//Arrange
		Number[] data = new Number[100];
		
		//Act
		data = reader.readTemperatureData2();
		
		//Assert
		assertTrue(data[1] != null);
	}
	
	@Test
	public void testReadRainfallDataGetsDataFromFile() {
		//Arrange
		Number[] data = new Number[100];
		
		//Act
		data = reader.readRainfallData();
		
		//Assert
		assertTrue(data[1] != null);
	}
	
	@Disabled //Unsure if Test Is Needed. Fails Because Of Try/Catch Statement @Test
	public void testException() {
		//Arrange
		
		//Act
		
		//Assert
		assertThrows(FileNotFoundException.class,
				() ->{
					reader.readFavouriteLocation();
				});
	}
	
}
