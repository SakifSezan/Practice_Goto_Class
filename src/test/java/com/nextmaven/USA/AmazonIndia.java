package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AmazonIndia {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement A = driver.findElement(By.id("twotabsearchtextbox"));
		A.sendKeys("samsung s23 ultra");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		A.sendKeys(Keys.ENTER);
		WebElement B = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 Ultra 5G (Green, 12GB, 256GB Storage)']"));
		B.click();
		WebElement C = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		C.click();
		//WebElement D = driver.findElement(By.id("attach-sidesheet-checkout-button-announce"));
		//D.click();
}
}
