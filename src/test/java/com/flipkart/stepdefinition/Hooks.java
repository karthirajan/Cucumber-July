package com.flipkart.stepdefinition;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");
		//browser launch
		c.launch();

	}
	
	@After
	public void afterScenario() {
		
		System.out.println("After Scenario");
		//browser quit
		driver.quit();

	}
	
	//Before
	//background
	//Scenario
	//After
	

}
