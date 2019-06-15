package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.Parent;
import com.pages.SignInPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninStepDef {
	
	WebDriver driver;
	
	SignInPages sp;

	@Given("^Im on a homepage$")
	public void im_on_a_homepage() throws Throwable {
	    driver=Parent.getDriver("chrome", driver);
	   driver.get(Parent.getGetURL());
	   sp=PageFactory.initElements(driver, SignInPages.class);
	}

	@When("^I clicks sign in Button$")
	public void i_clicks_sign_in_Button() throws Throwable {
	    sp.getClickSignIn().click();
	   
	}

	@When("^Enter a valid email as a \"([^\"]*)\" and password as a \"([^\"]*)\"$")
	public void enter_a_valid_email_as_a_and_password_as_a(String arg1, String arg2) throws Throwable {
	    sp.getUserEmail().sendKeys("Email");
	   
	}

	@When("^Clicks sign In button$")
	public void clicks_sign_In_button() throws Throwable {
	    sp.getPutPass().sendKeys("arg2");
	    sp.getSignInSubmit().click();
	   
	}

	@Then("^Successfully sign in$")
	public void successfully_sign_in() throws Throwable {
	    
	   
	}

}
