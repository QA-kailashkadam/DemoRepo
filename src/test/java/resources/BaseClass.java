package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Kailash\\eclipse-workspace\\CucumberFromScratch\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kailash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Kailash\\Downloads\\Udemy\\Selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kailash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Kailash\\Downloads\\Udemy\\Selenium\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Kailash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * driver = new ChromeDriver();
		 */
		driver.get(prop.getProperty("url"));
		return driver;

	}

}
