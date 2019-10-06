package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	// 
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By LoginButton = By.xpath("//button[@data-purpose='header-login']");
	
	//By LoginButton = By.xpath("//*[@id=\"udemy\"]/div[2]/div[2]/div[1]/div[4]/div[5]/div/button");

	public WebElement getLoginButton() {
		return driver.findElement(LoginButton);
	}

}
