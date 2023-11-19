package com.nextmaven.USA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class happy {
	@Test
	public void TX() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement T = driver.findElement(By.id("onlineId1"));
		T.sendKeys("selenium");
		WebElement W = driver.findElement(By.name("passcode1"));
		W.sendKeys("4545465");
		
		Thread.sleep(10000);
		
		
	}

}
