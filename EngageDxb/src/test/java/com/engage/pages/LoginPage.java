package com.engage.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.engage.utilities.ExcelUtility;
import com.engage.utilities.PageUtility;

public class LoginPage extends PageUtility{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left']/child::li[7]")
	private WebElement LoginBtn;
	
	@FindBy(css= "input[placeholder='Email']")
	private WebElement Email;
	

	@FindBy(css = "input[placeholder='Password']")
	private WebElement passwrd;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement submit;
	
	@FindBy(xpath = "(//i[@class='la la-times'])[3]")
	private WebElement closeBtn;
	
	@FindBy(xpath = "(//div[@class='sd-title'])[2]")
	private WebElement eventtext;
	
	public void Login() throws IOException {
		LoginBtn.click();}
	public void Credentials() throws IOException, InterruptedException {
		String email=ExcelUtility.getStringData(1, 2);
		Email.sendKeys(email);
		String pass=ExcelUtility.getStringData(1, 3);
		passwrd.sendKeys(pass);
		submit.click();
		Thread.sleep(4000);
		closeBtn.click();
		
	}
	public String ValidateLogin() {
		return GetElementText(eventtext);
	}
	}


