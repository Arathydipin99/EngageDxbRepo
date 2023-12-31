package com.engage.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.engage.pages.LoginPage;
import com.engage.pages.RegisterPage;


public class RegisterTest extends BaseTest {
	@Test
	public void MyRegisterTest() throws IOException, InterruptedException {
			
		LoginPage lp=new LoginPage(driver);
		
			
		RegisterPage rp = new RegisterPage(driver);
	
		lp.Login();	
		rp.NewRegister();
		String url= rp.ValidateRegister();
		Assert.assertEquals(url, "https://www.engagedxb.gov.ae/account/registration");
		

}
}