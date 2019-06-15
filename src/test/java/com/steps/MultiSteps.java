package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Parent;
import com.pages.MultiPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiSteps {
	
	WebDriver driver;
	
	MultiPages mp;
	

	@Given("^Open a home page$")
	public void open_a_home_page() throws Throwable {
	    driver=Parent.getDriver("chrome", driver);
	    driver.get(Parent.getGetURL());
	   mp=PageFactory.initElements(driver, MultiPages.class); 
	}

	@When("^Click sign in button$")
	public void click_sign_in_button() throws Throwable {
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")));
	    ac.click().build().perform();
	}

	@When("^enter an email as a \"([^\"]*)\" and password as a \"([^\"]*)\"$")
	public void enter_an_email_as_a_and_password_as_a(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.name("email")).sendKeys("anayet.amails@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("manha123");
		//mp.getUserEmail().sendKeys("username");
	    //mp.getPutPass().sendKeys("password");
	}

	@When("^Click sign in$")
	public void click_sign_in() throws Throwable {
	    mp.getSignInSubmit().click();
	    
	}

	@When("^Click on All meanu$")
	public void click_on_All_meanu() throws Throwable {
	    mp.Baby_site();
	    
	}

	@When("^Scorldown and click Baby$")
	public void scorldown_and_click_Baby() throws Throwable {
	    mp.scroldown();
	    Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}

	@When("^take a screenshot$")
	public void take_a_screenshot() throws Throwable {
	 mp.SS(driver, "Baby");   
	    
	}

	@Then("^it should take me to the baby page$")
	public void it_should_take_me_to_the_baby_page() throws Throwable {
	    
	    
	}

}
