package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_all_links_dropdown {

	public static void main(String[] args) {


			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=mobi1-btn-ft");
			
			driver.manage().window().maximize();
			
			List<WebElement> alllinks = driver.findElements(By.tagName("option"));
			System.out.println("All links are :"+alllinks.size());
			
			for(int i=0; i<alllinks.size();i++)
			{
				System.out.println("Links on page are :"+alllinks.get(i).getAttribute("value"));
				System.out.println("Text on page are :"+alllinks.get(i).getText());
			}

	}

}
