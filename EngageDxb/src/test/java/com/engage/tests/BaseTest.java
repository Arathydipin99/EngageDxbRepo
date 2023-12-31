package com.engage.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.engage.utilities.TestProperties;



public class BaseTest {
	 protected WebDriver driver;
		Properties prop;
		@BeforeMethod(alwaysRun=true)
		public void InitializeDriver() throws IOException  {
			
			prop = TestProperties.GetProperties();
	        String browserName=prop.getProperty("browser");
			String Environment = prop.getProperty("Environment");
			String Url = prop.getProperty(Environment);
			
			if (browserName.equals("Chrome")) {
				driver = new ChromeDriver();
				
			}

			else if (browserName.equals("Edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equals("Firefox")) {
				driver = new FirefoxDriver();
}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(Url);
		}
//		@AfterMethod(alwaysRun=true)
//		public void TearDown() {
//
//			driver.quit();
//		}
//		
}
