package com.engage.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.engage.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void MyLoginTest() throws IOException, InterruptedException {
			
		LoginPage lp=new LoginPage(driver);
		lp.Login();
		lp.Credentials();
		
		String text=lp.ValidateLogin();
		Assert.assertEquals(text, "UPCOMING EVENTS");
		
	}

}
