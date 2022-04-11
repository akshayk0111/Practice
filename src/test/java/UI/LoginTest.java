package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "chrome"; // external configuration - csv xls file
	public static WebDriver driver; // webdriver is interface here

	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); // setup of Firefox browser

			driver = new FirefoxDriver(); // here we create object of Firefox browser

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} 

		driver.get("https://www.saucedemo.com/"); // get link
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); // put user id

		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // put password

	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); // login button with xpath

		//driver.close(); // here we reset the connection

	}

}
