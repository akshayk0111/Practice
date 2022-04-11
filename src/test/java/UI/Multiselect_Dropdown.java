package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect_Dropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		WebElement drpdwn = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div[1]/div[1]/div[2]"));
		
		Select select = new Select(drpdwn);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.deselectAll();
		
		List<WebElement> element = select.getAllSelectedOptions();
		Thread.sleep(2000);
		System.out.println(element.size());
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		//select.selectByIndex(3);
		
	
	}

}
