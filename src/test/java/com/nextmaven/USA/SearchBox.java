package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class SearchBox {
	WebDriver driver;
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement T =  driver.findElement(By.name("q"));
		T.sendKeys("what is xpath");
		//WebElement W = driver.findElement(By.linkText(" in selenium"));
		T.sendKeys(Keys.ENTER);
		
	}

}
