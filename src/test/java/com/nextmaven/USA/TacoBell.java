package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class TacoBell {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.tacobell.com/");
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.xpath("//a[text()='Menu']"));
		A.click();
		WebElement B = driver.findElement(By.xpath("//span[text()='Tacos']"));
		B.click();
		
		WebElement C = driver.findElement(By.xpath("//h4[text()='Cheesy Gordita Crunch']"));
		
	
		
}
}