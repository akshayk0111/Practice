package UI;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		// basic methods

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]"));  //it will handle the web elements and and write down the list of particular element
		System.out.println(webelements);

		driver.navigate().to("https://www.myntra.com/login");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);

		driver.findElement(By.xpath("//*[@id=\"mountPoint\"]/div/div[2]/div[1]/div[2]/div[1]")).click();  
	Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		 driver.quit();

	}

}
