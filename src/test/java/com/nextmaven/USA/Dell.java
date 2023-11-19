package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Dell {
	
	@Test
	public void TX() throws Exception {
		System.setProperty("webdriver.firefox.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		FirefoxOptions firefox = new FirefoxOptions();
		firefox.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dell.com/");
		driver.navigate().refresh();
		
		WebElement T = driver.findElement(By.id("mh-search-input"));
		T.sendKeys("Monitor");
		T.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		//driver.manage().timeouts().getImplicitWaitTimeout();
		
		//driver.findElement(By.id("prompt-textarea")).sendKeys("Tell me something about you");
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(10000);
		//driver.close();
		
		
	}

}
