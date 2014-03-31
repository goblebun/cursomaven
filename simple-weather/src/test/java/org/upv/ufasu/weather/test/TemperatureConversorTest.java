package org.upv.ufasu.weather.test;

import org.upv.ufasu.weather.TemperatureConversor;

import junit.framework.TestCase;

public class TemperatureConversorTest extends TestCase {
	
	 public void testConversor() throws Exception {
	 
		 TemperatureConversor temperatureConversor = new TemperatureConversor();
		 int celsius = temperatureConversor.fahrenheitToCelsius(50);
		 assertEquals(10, celsius);
		 
	 }

}
