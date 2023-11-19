package com.nextmaven.USA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class myfirstclass {
	 
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAKIF\\eclipse-workspace\\USA\\ChromeDriver\\chrome.exe");
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	}
		

}
	


