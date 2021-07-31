package org.itc309.clyderiverapplication.desktop;

//Import for Chart library
import org.knowm.xchart.XYChart;
import org.knowm.xchart.style.XYStyler.ButtonPosition;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.XYStyler;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;

public class ChartCreator {

	public void QuickChartExample() {
		//Setup Data To be Charted
		double[] xData = new double[] {1.0, 3.0, 5.0, 7.0, 9.0};
		double[] yData = new double[] {3.0, 10.0, 7.0, 1.0, 4.0};
		double[] yData2 = new double[] {2.5,-3.5, 7.0, 1.5, 6.0};
		double[] yData3 = new double[] {4.0, 11.0, 8.0, 2.0, 5.0};
	
		//Create Chart And Add Data
		XYChart chart = QuickChart.getChart("Example Chart", "X Axis Title", "Y Axis Title", "Data Series 1", xData, yData);
		//NOTE: If you do not specify the xData (as below) the yData will be plotted weirdly
		chart.addSeries("Data Series 2", xData, yData2); 
		chart.addSeries("Data Series 3", xData, yData3);
		
		//Zoom The Chart
		//This displays a subsection of data but cannot be easily reset.
		//Zoom_XAxis(5.0, chart);
		
		//Enables Zoom		
		chart.getStyler().setZoomEnabled(true);
		//Enables Zoom Reset By Double Clicking on the Chart
		chart.getStyler().setZoomResetByDoubleClick(true);
		
		//Sets the reset button's position to the upper right corner - Inside means on the chart I think
		chart.getStyler().setZoomResetButtomPosition(XYStyler.ButtonPosition.InsideNE);
		
		//Extra Chart Styling
		//Enable Cursor On The Chart - Nicety
		chart.getStyler().setCursorEnabled(true);
		
		//Enable ToolTip on the Chart - Nicety
		chart.getStyler().setToolTipsEnabled(true);
		
		
		//Display The Chart
	
	 /* 	
	 *  Creates a window the black box way. No control but works.
	 *  The window is auto-generated so you lack control. Probably ok if you want the chart to
	 *  pop up on say a button click but no good if you want it integrated.
	 */
	     //	new SwingWrapper(chart).displayChart();
		
	
	//Create your own window and add the chart to it. Is comparable to the above method
		/* It's important to note the use of XChartPanel. This allows the chart to be added.
		* It is also highly useful as zooming can only be done on the XChart Panels.
		* Unless you want to write your own zoom functionality.
		*/
		JFrame window = new JFrame("Example Chart");
		JPanel chartPanel = new XChartPanel<XYChart>(chart);
		window.add(chartPanel);
		
		window.pack();
		window.setVisible(true);
		
		
	}
	
	//Methods add the power to zoom in on the chart
	private void Zoom_XAxis_YAxis(double xZoom, double yZoom, XYChart chart) {
		chart.getStyler().setYAxisMax(yZoom);
		chart.getStyler().setXAxisMax(xZoom);
		chart.getStyler().setYAxisMin(0.0d);
		chart.getStyler().setXAxisMin(0.0d);
	}
	private void Zoom_XAxis(double xZoom, XYChart chart) {
		chart.getStyler().setXAxisMax(xZoom);
		chart.getStyler().setXAxisMin(0.0d);
	}
	private void Zoom_YAxis(double yZoom, XYChart chart) {
		chart.getStyler().setYAxisMax(yZoom);
		chart.getStyler().setYAxisMin(0.0d);
	}
}
