package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoBlaze {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement A = driver.findElement(By.id("login2"));
		A.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement B = driver.findElement(By.id("loginusername"));
		B.sendKeys("ssezan@yahoo.com");
		WebElement C = driver.findElement(By.id("loginpassword"));
		C.sendKeys("ganja007@");
		WebElement D = driver.findElement(By.xpath("//button[text()='Log in']"));
		D.click();
		WebElement E = driver.findElement(By.id("logout2"));
		E.click();
		
		//driver.close();

}
}
