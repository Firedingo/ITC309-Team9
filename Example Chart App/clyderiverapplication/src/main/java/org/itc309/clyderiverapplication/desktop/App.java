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
        ChartCreator chart = new ChartCreator();
        chart.QuickChartExample();
    }
}
