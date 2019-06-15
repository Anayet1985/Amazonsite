package com.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultiPages {

 WebDriver driver;
 
 public MultiPages(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
 @FindBy(xpath="//input[@type='username']")
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
	public void Baby_site() {
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		slt.selectByVisibleText("Baby");

	  WebElement we = slt.getFirstSelectedOption();
	   System.out.println(we);
	}
	public void scroldown() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	public void SS(WebDriver driver, String Baby) throws IOException {
	TakesScreenshot tkss = (TakesScreenshot)driver;
	File f1 = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1,new File("./ScreenShott"+Baby+".png"));
	}
}