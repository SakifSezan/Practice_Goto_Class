package com.nextmaven.USA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTab {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://whataburger.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://youtube.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://facebook.com/");
		
		driver.close();

}
}