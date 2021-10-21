package com.tahauddin.syed;

public class BikeFactory {

	// stopping other users to create the object of BikeFactory.
	private BikeFactory() {
	}
	
	// call this method by using class name directly
	// thats why marked this method as static.
	public static Bike getBike(String bikename) {
		if (bikename.equalsIgnoreCase("hero")) {
			return new HeroBike();
		} else if (bikename.equalsIgnoreCase("honda")) {
			return new HondaBike();
		} else if (bikename.equalsIgnoreCase("bajaj")) {
			return new BajajBike();
		} else if (bikename.equalsIgnoreCase("apache")) {
			return new ApacheBike();
		} else  {
			System.out.println("Please Enter valid Bike Manifaccturer Name");
			return null;
		}
	}
}
