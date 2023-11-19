package com.nextmaven.USA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class you {
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\SAKIF\\eclipse-workspace\\USA\\ChromeDriver\\chrome.exe");
		FirefoxOptions firefox = new FirefoxOptions();
		firefox.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.homedepot.com/");
		//driver.manage().window().maximize();
	    WebElement t = driver.findElement(By.id("headerSearch"));
		t.sendKeys("hammer");
		driver.findElement(By.xpath("//*[@id=\"headerSearchButton\"]/svg/path")).click();
		
		
		
		
		//driver.quit();
		//driver.close();
	
	
}
}


