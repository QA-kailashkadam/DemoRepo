package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {

	public WebDriver driver;

//Assign driver to this class driver
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Define Locators
	By WelcomeLabel = By.xpath("//h2[contains(text(),'Welcome back')]");
	//By EmailId = By.xpath("//input[@id='email--1']");
	//By Password = By.xpath("//input[@id='id_password']");
	//By LoginButton = By.xpath("//input[@id='submit-id-submit']");

	//h2[contains(text(),'Welcome back')]
	
	// Get WebElement
	public WebElement getWelcomeLabel() {
		return driver.findElement(WelcomeLabel);
	}
/*
	public WebElement getEmailId() {
		return driver.findElement(EmailId);
	}

	public WebElement getPassword() {
		return driver.findElement(Password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
	}*/
};