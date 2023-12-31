package com.engage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.engage.utilities.PageUtility;

public class SearchPost extends PageUtility{
	WebDriver driver;

	public SearchPost(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(css = "input[id='searchbox']")
	private WebElement Search;
	
	@FindBy(css = "select[name='type']")
	private WebElement dropdown;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement searchbtn;
	
	@FindBy(xpath = "(//a[@title='Times World Information Technology LLC'])[1]")
	private WebElement Details;
	
	
	public void SearchHere() throws InterruptedException {
		Thread.sleep(3000);
		Select staticDropdown = new Select(dropdown);
		Thread.sleep(3000);
		staticDropdown.selectByValue("COMPANY");
		Thread.sleep(2000);
		Search.sendKeys("Times World");
		searchbtn.click();
	}
	
	public void ValidateSearch() {
		Details.click();
		
	}

}
