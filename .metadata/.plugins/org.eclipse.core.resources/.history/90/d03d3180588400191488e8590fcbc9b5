package com.testvagrant.pages;

import com.sun.javafx.PlatformUtil;
import com.utilities.WaitForMilliSeconds;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignInPage {

	public WebDriver driver;

	@FindBy(linkText = "Your trips")
	public WebElement Youtrips;

	@FindBy(id = "SignIn")
	public WebElement SignIn;

	@FindBy(id = "signInButton")
	public WebElement signInButton;

	@FindBy(id = "errors1")
	public WebElement errorMessage;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WaitForMilliSeconds waitFor = new WaitForMilliSeconds();

	public String shouldThrowAnErrorIfSignInDetailsAreMissing() {

		try {
			Youtrips.click();
			SignIn.click();

			driver.switchTo().frame("modal_window");
			waitFor.waitForMilliSeconds(2000);
			signInButton.click();
			waitFor.waitForMilliSeconds(2000);
		} catch (Exception e) {
			Reporter.log(e.getMessage());
		}
		String errorMessageText = errorMessage.getText();
		System.out.println("The error message is " + errorMessageText);

		return errorMessageText;

	}

}
