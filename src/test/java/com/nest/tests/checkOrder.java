package com.nest.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkOrder {
   WebDriver driver;
   @Test
   public void placeOrder() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
   }
}
