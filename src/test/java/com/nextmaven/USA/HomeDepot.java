package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomeDepot {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://homedepot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebElement T = driver.findElement(By.xpath("//a[text()='Back to School']"));
		//T.click();
		WebElement W =  driver.findElement(By.xpath("//input[@id='headerSearch']"));
		W.sendKeys("chest freezer");
		W.sendKeys(Keys.ENTER);

}
}
