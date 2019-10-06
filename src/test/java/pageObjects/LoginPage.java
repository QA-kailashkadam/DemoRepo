package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

//Assign driver to this class driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Define Locators
	By LoginWithDifferentUser = By.xpath("//a[@class='cancel-link']");
	By EmailId = By.xpath("//input[@id='email--1']");
	By Password = By.xpath("//input[@id='id_password']");
	By LoginButton = By.xpath("//input[@id='submit-id-submit']");

	// Get WebElement
	public WebElement getLoginWithDifferentUser() {
		return driver.findElement(LoginWithDifferentUser);
	}

	public WebElement getEmailId() {
		return driver.findElement(EmailId);
	}

	public WebElement getPassword() {
		return driver.findElement(Password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
	}
};