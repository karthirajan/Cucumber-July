package com.flipkart.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
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
	public void afterScenario(Scenario scenario) {
		
		System.out.println("After Scenario");
		
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}else{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		
		//browser quit
		driver.quit();

	}
	
	//Before
	//background
	//Scenario
	//After
	

}
