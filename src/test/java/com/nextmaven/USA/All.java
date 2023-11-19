package com.nextmaven.USA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class All {
	@Test
	public void Sakif() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

}
}
