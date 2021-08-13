package org.itc309.clyderiverapplication.desktop;

/**
 * Hello world! Main.java In Case you weren't sure
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //This calls for the chart to be created and displayed. Data IS hardcoded in the example!
      //  ChartCreator chart = new ChartCreator();
      //  chart.QuickChartExample();
        
        InterfaceBuilder Ibuilder = new InterfaceBuilder();
        Ibuilder.createWindow();
        
        FileReader FR = new FileReader();
        try {
			FR.readCSV();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
