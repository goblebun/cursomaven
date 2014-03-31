package org.upv.ufasu.weather;

public class TemperatureConversor {

	public int fahrenheitToCelsius(int fahrenheit) {
	
		  double celsius = ((fahrenheit-32)/1.8);
		 
		return (int) celsius;
	
	}

}
