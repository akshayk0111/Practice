package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		

		WebElement drpdwn  = driver.findElement(By.name("employees_c"));
		
		Select select = new Select(drpdwn);
		


		select.selectByValue("level1");  //it will select by value inserted
		Thread.sleep(3000);
		select.selectByVisibleText("51 - 100 employees"); //it will selected by visible text
		Thread.sleep(3000);
		select.selectByIndex(5); //it will selected by index 
		Thread.sleep(3000);
		

	}

}
