package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Xpath_Demo {
	WebDriver driver;
	@Test
	public void Z() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 
		WebElement T =  driver.findElement(By.xpath("//input[@name='acctNumberField']"));
	    T.sendKeys("Hello");
	    WebElement W = driver.findElement(By.xpath("//a[contains(text(), 'Privacy')]"));
		W.click();
        Thread.sleep(10000);
        
        driver.quit();
}
}
