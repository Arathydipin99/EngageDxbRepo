package com.engage.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.engage.pages.LoginPage;
import com.engage.pages.SearchPost;

public class SearchPostText extends BaseTest{
	
		
		@Test
		public void SearchTest() throws IOException, InterruptedException {
			LoginPage lp=new LoginPage(driver);
			lp.Login();
			lp.Credentials();
			SearchPost sp=new SearchPost(driver);
			sp.SearchHere();
			sp.ValidateSearch();
	
		}
}
