package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestion_Drpdwn {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='From']")).click(); // due to popups it will not go further .. but it
																		// is working fine

		WebElement element = driver.findElement(By.xpath("//input[@placeholder='From']"));

		element.sendKeys("Mumbai");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		element.sendKeys(Keys.ENTER);

		 driver.close();
	}

}
