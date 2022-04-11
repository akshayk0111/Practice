package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath_1 {

	public static void main(String[] args) {


			//relative xPath 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register/");
		
		
		
		
		
		driver.close();
	}

}
