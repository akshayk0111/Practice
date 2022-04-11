package UI;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
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
		//locator types : 
		//driver.get("https://www.saucedemo.com/"); // get link
		
//		driver.findElement(By.id("user-name")).sendKeys("Testing");  // ID
//		driver.findElement(By.className("input_error form_input")).sendKeys("Testing"); //classname
//		
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");   //css selectors
		
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");  //by xpath
		
		
//		driver.findElement(By.tagName("input")).sendKeys("Testing");  //by tag 
		
//		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
//		driver.findElement(By.linkText("Check out our")).click();  //link text and partial text

			//Relative locators 
		
		//above locator    due to lower versionb it is not working ..add latest dependancies andd use it
//		
//		driver.get("https://www.saucedemo.com/");
//		WebElement password = driver.findElement(By.id("password"));
//		driver.findElement(with("input")).ab
		
	}

}
