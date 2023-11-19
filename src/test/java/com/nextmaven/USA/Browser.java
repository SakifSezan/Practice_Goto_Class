package com.nextmaven.USA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Browser {
	@Test
	public void TX() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions Htown = new ChromeOptions();
		Htown.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airbnb.com/");
	}

}
