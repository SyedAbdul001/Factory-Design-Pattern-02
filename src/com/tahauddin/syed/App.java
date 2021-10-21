package com.tahauddin.syed;

public class App {

	public static void main(String[] args) {

		// pssing hero to get HeroBike Object
		Bike herobike = BikeFactory.getBike("hero");
		System.out.println("Getting Hero Bike Object");
		String name1 = herobike.getName();
		System.out.println(name1);
		
		// pssing bajaj to get HeroBike Object
		Bike bajajbike = BikeFactory.getBike("bajaj");
		System.out.println("Getting Bajaj Bike Object");
		String name2 = bajajbike.getName();
		System.out.println(name2);
		
		// pssing apache to get HeroBike Object
		Bike apachebike = BikeFactory.getBike("apache");
		System.out.println("Getting Apache Bike Object");
		String name3 = apachebike.getName();
		System.out.println(name3);
		
		// pssing honda to get HeroBike Object
		Bike hondabike = BikeFactory.getBike("honda");
		System.out.println("Getting Honda Bike Object");
		String name4 = hondabike.getName();
		System.out.println(name4);
	}

}
