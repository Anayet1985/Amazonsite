package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FreshSitePages {

	 WebDriver driver;
	
	public  FreshSitePages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	 
		
	}
	
	public void Fresh_site() {
	Select slt = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	slt.selectByVisibleText("Amazon Fresh");

  WebElement we = slt.getFirstSelectedOption();
   System.out.println(we);
}
}