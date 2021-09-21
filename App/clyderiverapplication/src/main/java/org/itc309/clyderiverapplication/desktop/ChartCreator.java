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
	public XChartPanel<CategoryChart> createChart() {
	//	return createXYChart(350, 350, "Test Chart", "Test X Data", "Test Y Data");
		
		return createCategoryChart(420,350,"Test Chart", "Test X Data", "Test Y Data");
	}
	
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
	private XChartPanel<CategoryChart> createCategoryChart(int width, int height, String title, String XLabel, String YLabel) {
		CategoryChart chart = new CategoryChartBuilder().width(width).height(height).title(title).xAxisTitle(XLabel).yAxisTitle(YLabel).build();
		
		//style
		chart.getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Line);
		
		//Style Chart
				chart.getStyler().setHasAnnotations(true);
				chart.getStyler().setToolTipsEnabled(true);
				chart.getStyler().setLegendLayout(LegendLayout.Vertical);
				chart.getStyler().setLegendPosition(LegendPosition.OutsideS);
		
		//add data
		 List<String> xDataList = Arrays.asList("One", "Two", "Three", "Four", "Five");
		 /*List<Date> xData = new ArrayList<Date>();
		 Date[] data = testXDataString();
		 for (int i=0; i<5; i++) {
			 xData.add(data[i]);
		 }*/
		 CategorySeries series = chart.addSeries("String Test Series", new ArrayList<String>(Arrays.asList(reader.readTime())), new ArrayList<Number>(Arrays.asList(reader.readData())));
	//	chart.addSeries(seriesName, xData, yData)
		 
	//	 CategorySeries series1 = chart.addSeries
		 
		 
		
		
		
		
		return new XChartPanel<CategoryChart>(chart);
	}
	
	

	
	
	//Can be used to test your chart works - For Testing Purposes only
	private double[] testXDataDouble() {
		double[] xData = new double[] {10, 15, 21, 42, 57};
		return xData;
	}
	
	private Number[] testYData() {
		Number[] yData = new Number[] {1, 3, 7, 5, 3};
		return yData;
	}
	
	private String[] testXDataString() {
		String[] xData = new String[] {"00.01.02", "Two", "Three", "Four", "Five" };
		return xData;
	//return null;
	}
	

}
