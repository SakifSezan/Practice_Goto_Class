package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Walmart {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		FirefoxOptions TX = new FirefoxOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new FirefoxDriver();
		driver.get("https://walmart.com");
		
		WebElement A1 =  driver.findElement(By.id("header-input-search"));
		A1.sendKeys("laptop");
		//WebElement B = driver.findElement(By.xpath("//button[text()='Try a different method']"));
		//B.click();

}
}