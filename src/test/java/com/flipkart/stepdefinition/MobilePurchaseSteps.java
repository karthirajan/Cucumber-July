package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends Commonactions{
	
	Commonactions c = new Commonactions();
	MobilePurchasePage m = new MobilePurchasePage();
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		
		//c.launch();
	    
	}

	@Given("user login into flipkart")
	public void user_login_into_flipkart() {
		
       try{
			
			
			m.getCloseIcon().isDisplayed();
			m.getCloseIcon().click();
			
		}catch (Exception e) {
			
			System.out.println("Login not required");
			
		}
	    
	}

	@When("user search mobile")
	public void user_search_mobile() {
		
		
		c.insertText(m.getSearch(), "realme");
		
	    String fn = m.getMobileName().getText();
	    m.getMobileName().click();
	    
	}

	@When("user choose the mobile and doing payments")
	public void user_choose_the_mobile_and_doing_payments() {
		
		c.windowsHandling();
	    
	}

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() {
		
		System.out.println("drpdown & screenshot");
		
		c.scrollDown(m.getBuyNow());
		String text = m.getBuyNow().getText();
		
		Assert.assertEquals("BUY NOW", text);
		
		//driver.quit();
	    
	}
	
	@When("user search mobile by using one dim list")
	public void user_search_mobile_by_using_one_dim_list(DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		
		c.insertText(m.getSearch(), asList.get(0));
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+asList.get(0)+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}
	
	@When("user search mobile by using one dim map")
	public void user_search_mobile_by_using_one_dim_map(DataTable dataTable) {
		
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.name("q")).sendKeys(asMap.get("phone1"),Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+asMap.get("phone1")+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}
	
	@When("user search mobile {string}")
	public void user_search_mobile(String names) {
		
		
		driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}


}
