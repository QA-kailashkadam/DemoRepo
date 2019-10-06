package stepDefinitions;

import java.util.Set;

import org.junit.Assert;
import org.junit.runner.RunWith;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import resources.BaseClass;

@RunWith(Cucumber.class)
public class StepDefinitions extends BaseClass {
	
	LandingPage lp;
	LoginPage lp2;
	WelcomePage wp;
		
	@Given("^User is on Landing Page$")
	public void user_is_on_Landing_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		
		lp = new LandingPage(driver);
		//Assert.assertex(lp.getLoginButton().isDisplayed());
		lp.getLoginButton().click();
		
		String handle= driver.getWindowHandle();
        System.out.println(handle);
        
        //lp.getLoginButton().click();

        // Store and Print the name of all the windows open	              

        Set<String> handles = driver.getWindowHandles();

        System.out.println(handles);
        
        for (String handle1 : driver.getWindowHandles()) {

        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		lp2=new LoginPage(driver);		
		//lp2.getLoginWithDifferentUser().click();
		lp2.getEmailId().sendKeys(arg1);
		lp2.getPassword().sendKeys(arg2);
		lp2.getLoginButton().click();
	}

	@Then("^Welcome page with name \"([^\"]*)\"$")
	public void welcome_page_with_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wp=new WelcomePage(driver);
		
		String WelcomeText = wp.getWelcomeLabel().getText();
		String sarg1 = arg1;
		System.out.println("From label" + WelcomeText);
		System.out.println("arg1" + sarg1);
		Assert.assertTrue(wp.getWelcomeLabel().getText().contains("Welcome"));
		//Assert.assertArrayEquals(expecteds, actuals);
		//Assert.assertEquals("Welcome back, Kailash", wp.getWelcomeLabel().getText());
		
		
	}

}
