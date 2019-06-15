package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPages {

	WebDriver driver;
	
	public SignInPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	private WebElement ClickSignIn;

	public WebElement getClickSignIn() {
		return ClickSignIn;
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement UserEmail;

	public WebElement getUserEmail() {
		return UserEmail;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement PutPass;

	public WebElement getPutPass() {
		return PutPass;
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignInSubmit;

	public WebElement getSignInSubmit() {
		return SignInSubmit;
	}
}
