package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TvPurchaseSteps extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	@When("user search tv")
	public void user_search_tv() {
	   
		
		driver.findElement(By.name("q")).sendKeys("realme tv",Keys.ENTER);
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'realme')])[1]"));
	    String fn = mobileName.getText();
	    mobileName.click();
		
	}

	@When("user choose the tv and doing payments")
	public void user_choose_the_tv_and_doing_payments() {
	    
		c.windowsHandling();
		
	}

}
