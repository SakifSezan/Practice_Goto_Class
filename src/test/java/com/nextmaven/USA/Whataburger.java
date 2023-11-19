package com.nextmaven.USA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Whataburger {
	WebDriver driver;
	@Test
	public void Z() {
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://whataburger.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement T = driver.findElement(By.xpath("//a[contains(text(),'MENU ')]"));
		T.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement W = driver.findElement(By.xpath("//p[contains(text(),'View all 9')]"));
		W.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement R = driver.findElement(By.xpath("//span[contains(text(),'Southern Bacon Double Burger')]"));
		R.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement U = driver.findElement(By.xpath("//button[text()=' Choose Meal Option ']"));
		U.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Y = driver.findElement(By.xpath("//h5[text()='Southern Bacon Double Burger Only']"));
		Y.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement X = driver.findElement(By.xpath("//button[text()='Continue']"));
		X.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Z = driver.findElement(By.xpath("//button[text()='Add to My Order']"));
		Z.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement A = driver.findElement(By.xpath("//label[@for='pickup']"));
		A.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement B = driver.findElement(By.xpath("//button[text()=' Set Pickup Method ']"));
		B.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement C = driver.findElement(By.id("select-loc-chevron_432"));
		C.click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement D = driver.findElement(By.xpath("//button[text()=' Checkout ']"));
		D.click();
		WebElement E  = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		E.click();
		
		WebElement F = driver.findElement(By.id("username"));
		F.sendKeys("admin1234@yahoo.com");
		WebElement G = driver.findElement(By.id("password"));
		G.sendKeys("Admindemo1234@");
		WebElement H = driver.findElement(By.xpath("//button[text()=' Sign In ']"));
		H.click();
		
		WebElement I = driver.findElement(By.xpath("//label[contains(text(),' ')]"));
		I.click();
		
		
		
		
		
		

}
}