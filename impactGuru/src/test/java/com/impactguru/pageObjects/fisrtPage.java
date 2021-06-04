package com.impactguru.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fisrtPage {

	
	WebDriver ldriver;

	public fisrtPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"auth-local-btn\"]")
	WebElement usernameonFirsthit;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='submit']")
	WebElement submit;
	
	
	@FindBy(xpath = "//*[@id=\"cmp-nfr-top-side-donate\"]")
	WebElement donatenow;

	
	
	public void clickusernameonFirsthit() {
		usernameonFirsthit.click();
	}
	
	public void SendUserName() {
		username.sendKeys("candidate");	
	
	}
	
	
	public void SendPassword() {
		password.sendKeys("igcandidate");	
	
	}
	
	public void clicksubmit() {
		submit.click();
	
	}
	
	public void clickdonateNow() {
		donatenow.click();
	
	}
}
