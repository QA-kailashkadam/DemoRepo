package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.BaseClass;

public class Hooks extends BaseClass {

	public WebDriver driver;

	@Before("@Login")

	public void beforeLogin() throws IOException

	{
		driver = BaseClass.getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@After("@Login")

	public void afterLogin()

	{
		driver.close();
	}

}
