package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RGPS {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://fancy-pika-6b453f.netlify.app/");
		driver.manage().window().maximize();
		
		WebElement A =  driver.findElement(By.xpath("//button[text()='LogIn']"));
		A.click();
		WebElement B = driver.findElement(By.id("email"));
		B.sendKeys("ssezan@yahoo.com");
		WebElement C  = driver.findElement(By.id("password"));
		C.sendKeys("ganja007@");
		WebElement D = driver.findElement(By.xpath("//button[text()='Sign In']"));
		D.click();
		

}
}