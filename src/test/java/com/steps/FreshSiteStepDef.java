package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.Parent;
import com.pages.FreshSitePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreshSiteStepDef {
	WebDriver driver;
	
	FreshSitePages fp;

	@Given("^User on homepage$")
	public void user_on_homepage() throws Throwable {
	    driver=Parent.getDriver("chrome",driver);
	    driver.get(Parent.getGetURL());
	    fp=PageFactory.initElements(driver, FreshSitePages.class);
	   }

	@When("^user clicks on all site button$")
	public void user_clicks_on_all_site_button() throws Throwable {
	    
	   
	}

	@When("^clicks Amazon Fresh$")
	public void clicks_Amazon_Fresh() throws Throwable {
	    fp.Fresh_site();
	   
	}

	@Then("^Site is visible$")
	public void site_is_visible() throws Throwable {
	    
	   
	}

}
