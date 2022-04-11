package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_All_links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));  //it will print all tags with name 
		System.out.println("Total tags are :"+alllinks.size());
		
		for(int i=0;i< alllinks.size();i++)  //it will iterate the links and print them 
		{
			System.out.println("Links on page are :"+alllinks.get(i).getAttribute("href"));
			
			System.out.println("text on page are :"+alllinks.get(i).getText());
		}
		
		driver.close();
	}

}
