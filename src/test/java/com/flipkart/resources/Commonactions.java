package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void launch() {
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 options.addArguments("disable-popup-blocking");
		// options.addArguments("--headless");
		 
		 driver = new ChromeDriver(options);
		 driver.get("https:/www.flipkart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
	public void windowsHandling() {
		
		 String parent = driver.getWindowHandle();
			
			Set<String> child = driver.getWindowHandles();
			for (String x : child) {
				
				if(!x.equals(parent)){
					driver.switchTo().window(x);
					System.out.println("window switched");
				}
				
			}

	}
	
	public void scrollDown(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	
    public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");

	}

}
