package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.Parent;
import com.pages.msOverYourHeartsPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YourHeartsSteps {

	WebDriver driver;
	
	msOverYourHeartsPages mp;
	
	@Given("^Im on pagesite$")
	public void im_on_pagesite() throws Throwable {
	   driver=Parent.getDriver("chrome", driver);;
	   driver.get(Parent.getGetURL());
	   mp=PageFactory.initElements(driver, msOverYourHeartsPages.class);
	}

	@When("^I Click mouse on Account and list Button$")
	public void i_Click_mouse_on_Account_and_list_Button() throws Throwable {
	   //mp.msover();
	   
	}

	@When("^I click Your Hearts menu$")
	public void i_click_Your_Hearts_menu() throws Throwable {
	  mp.msover();
	   
	}

	@Then("^Your Hearts page showed$")
	public void your_Hearts_page_showed() throws Throwable {
	   
	   
	}
}
