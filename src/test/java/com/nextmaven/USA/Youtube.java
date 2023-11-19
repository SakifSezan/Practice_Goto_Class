package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Youtube {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement T = driver.findElement(By.name("search_query"));
		T.sendKeys("noya daman");
		T.sendKeys(Keys.ENTER);
		WebElement W = driver.findElement(By.linkText("Muza - Noya Daman (ft. Tosiba & Meem Haque) | Official Lyric Video | Sylheti Wedding Song | Iqbal |"));
        W.sendKeys(Keys.ENTER);
}
}