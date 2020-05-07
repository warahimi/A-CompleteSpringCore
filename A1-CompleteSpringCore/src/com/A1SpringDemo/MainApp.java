package com.A1SpringDemo;

public class MainApp {

	public static void main(String[] args) {
		//Create the object 
//		BaseballCoach theCoach = new BaseballCoach(); // to make this reference work for every coach we use interface approach. it is the best SE practice
		
//		Coach theCoach = new BaseballCoach(); //generic reference
		
		Coach theCoach = new TrackllCoach(); // our app is not configurable. is hardcoded here. Spring can solve this problem using config file
		
		//Use the object
		System.out.println(theCoach.getDailyWorkOut());		

	}

}
