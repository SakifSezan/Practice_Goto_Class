package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class uber {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.uber.com/");
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.xpath("//div[text()='Enter location']"));
		A.click();
		
		WebElement B = driver.findElement(By.xpath("//div[text()='6403 Sierra Blanca Dr, Houston, TX']"));
		//B.sendKeys("")
		//B.sendKeys(Keys.ENTER);
}
}
