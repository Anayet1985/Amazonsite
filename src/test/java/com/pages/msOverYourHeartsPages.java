package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class msOverYourHeartsPages {

	WebDriver driver;
	
	public msOverYourHeartsPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void msover() throws InterruptedException {
		Actions ac = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		 Thread.sleep(3000);
		 ac.moveToElement(we).moveToElement(driver.findElement(By.linkText("Your Account"))).click().build().perform();
	
	}
}
