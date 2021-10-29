package org.itc309.clyderiverapplication.desktop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.internal.chartpart.Chart;
import org.knowm.xchart.style.Styler.LegendLayout;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.XYStyler;

//Creates a number of charts using the XChart library, primarily an XYChart and a CategoryChart.
public class ChartCreator {
	private CoreFileReader reader = new CoreFileReader();
	
	//Method is never used - Creates an XYChart from XChart
	private XChartPanel<XYChart> createXYChart(int width, int height, String title, String XLabel, String YLabel) {
		//Create Chart
		XYChart chart = new XYChartBuilder().width(width).height(height).title(title).xAxisTitle(XLabel).yAxisTitle(YLabel).build();
		
		//Style Chart
		chart.getStyler().setCursorEnabled(true);
		chart.getStyler().setHasAnnotations(true);
		chart.getStyler().setToolTipsEnabled(true);
		chart.getStyler().setZoomEnabled(true);
		chart.getStyler().setZoomResetByDoubleClick(true);
		chart.getStyler().setZoomResetByButton(true);
		chart.getStyler().setZoomResetButtomPosition(XYStyler.ButtonPosition.InsideNE);
		chart.getStyler().setLegendLayout(LegendLayout.Vertical);
		chart.getStyler().setLegendPosition(LegendPosition.OutsideS);
	
		//Add Data
		
	//	chart.addSeries("Test Data", testXDataDouble(), testYData());
		
		
		//return chart + XChart's Corresponding Panel Which Allows For Zooming
		return new XChartPanel<XYChart>(chart);
	}
	
	//Creates a CategoryChart to display data
	public XChartPanel<CategoryChart> createCategoryChart(int width, int height, String title, String XLabel, String YLabel, String Location, int Weather) throws IllegalArgumentException {
		CategoryChart chart = new CategoryChartBuilder().width(width).height(height).title(title).xAxisTitle(XLabel).yAxisTitle(YLabel).build();
		
		if (Location == null) {
			Location = "";
		}
		
		
		//Set Chart Render Style
		chart.getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Line);
		
		//Style Chart
				chart.getStyler().setHasAnnotations(true);
				chart.getStyler().setToolTipsEnabled(true);
				chart.getStyler().setLegendLayout(LegendLayout.Vertical);
				chart.getStyler().setLegendPosition(LegendPosition.OutsideS);
				chart.getStyler().setXAxisLabelRotation(45);
		
		//add data 0 = Temp | 1 = Rainfall | Don't care for Salinity
				System.out.println("INFO: Location: " + Location);
				if (Location.equals("Budd Island") || Location.equals("Weather Station - Budd Island")) {
					if (Weather == 0) {
					CategorySeries series = chart.addSeries("String Test Series", new ArrayList<String>(reader.readTime(Location, false)), new ArrayList<Number>(reader.readTemperatureData()));
					}
					if (Weather == 1) {
						CategorySeries series = chart.addSeries("String Test Series", new ArrayList<String>(reader.readTime(Location, false)), new ArrayList<Number>(reader.readRainfallData()));
						}
				}
				else {
					//Random Edge Case
					if (Location.equals(" ") || Location.equals(null)) {
						String[] xData = new String[] {"01:42:38", "03:17:21", "07:14:57", "13:59:06", "18:12:56" };
						Number[] yData = new Number[] {15.0, 12.4, 27.82, 35.67, 89.18};
						CategorySeries series = chart.addSeries("String Test Series", new ArrayList<String>(Arrays.asList(xData)), new ArrayList<Number>(Arrays.asList(yData)));
					}
					else {
						//Regular Salinity
						CategorySeries series = chart.addSeries("String Test Series", new ArrayList<String>(reader.readTime(Location, false)), new ArrayList<Number>(reader.readData(Location, false)));
					}
				}
		 
		 //	chart.addSeries(seriesName, xData, yData)
		 
	//	 CategorySeries series1 = chart.addSeries
		 
		 
		
		
		
		
		return new XChartPanel<CategoryChart>(chart);
	}

}
