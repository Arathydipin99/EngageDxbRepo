package com.engage.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.engage.utilities.ExcelUtility;
import com.engage.utilities.PageUtility;

public class RegisterPage extends PageUtility {
	
		WebDriver driver;

		public RegisterPage(WebDriver driver) {
	        super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		

		@FindBy(xpath = "//a[@class='btn btn-default']")
		private WebElement RegisterBtn;
		
		@FindBy(xpath = "//input[@name='firstName']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@name='lastName']")
		private WebElement lastName;
		
		
		@FindBy(xpath = "(//i[@class='fa fa-angle-right'])[1]")
		private WebElement nextBtn;
		
		@FindBy(css= "input[placeholder='Email*']")
		private WebElement email;
		
		@FindBy(css = "input[placeholder='Password*']")
		private WebElement password;
		
		@FindBy(css = "input[placeholder='Confirm password*']")
		private WebElement confirmpassword;
		
		@FindBy(css = "input[type='checkbox']")
		private WebElement Checkbox;
		
		@FindBy(xpath = "(//a[@class='nextButton'])[2]")
		private WebElement Next;
		

		@FindBy(xpath = "(//div[@class='form-group col-md-12'])[10]/child::a[2]")
		private WebElement skip;
		
		@FindBy(xpath = "//h3[text()='Register']")
		private WebElement RegText;
		
		
		
		
		public void NewRegister() throws InterruptedException, IOException {
			RegisterBtn.click();
			String FirstName= ExcelUtility.getStringData(1, 0);
			firstName.sendKeys(FirstName);
			String LastName= ExcelUtility.getStringData(1, 1);
			lastName.sendKeys(LastName);
			ClickElement(nextBtn);
			String Email= ExcelUtility.getStringData(1, 2);
			email.sendKeys(Email);
			
			String Password= ExcelUtility.getStringData(1, 3);
			password.sendKeys(Password);
			String Confirm= ExcelUtility.getStringData(1, 4);
			confirmpassword.sendKeys(Confirm);
			ClickElement(Checkbox);
			ClickElement(Next);
			
			Thread.sleep(3000);
			ClickElement(skip);

			
			
		}
		public String ValidateRegister() {
			return driver.getCurrentUrl();
			
		}
		

}
