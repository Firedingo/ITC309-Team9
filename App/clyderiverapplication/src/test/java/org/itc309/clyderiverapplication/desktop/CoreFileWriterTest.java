package org.itc309.clyderiverapplication.desktop;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CoreFileWriterTest {
	
	CoreFileWriter writer = new CoreFileWriter();
	CoreFileReader reader = new CoreFileReader();

	@Disabled //Not Needed To Run @Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPreferencesPathIsValid() {
		//Arrange
		writer.setPath();
		File actualPath;
		File expectedPath = new File ("D:\\\\\\\\Uni\\\\\\\\ITC309\\\\\\\\ITC309-Team9\\\\\\\\App\\\\\\\\data\\\\\\\\preferences.txt");
		
		//Act
		actualPath = writer.getPath();
		
		//Assert
		assertEquals(expectedPath, actualPath);
	}
	
	@Test
	public void testDataInputToFile() {
		//Arrange
		String testLocation;
		
		//Act
		writer.writeToFile("Test");
		testLocation = reader.readFavouriteLocation();
		
		//Assert
		assertEquals(testLocation, "Favourite Location: Test");
	}

}
