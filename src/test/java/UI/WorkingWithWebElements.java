package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.paypal.com/in/signin");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.name("login_email")).sendKeys("Akshaykharmate@gmail.com"); // it will find element by name and pass the name
																		// as testing
		Thread.sleep(2000);

		driver.findElement(By.name("login_email")).clear(); // what we have passed will clear that field

		Thread.sleep(2000);
		System.out.println("Attribute Name is : ");
		System.out.println(driver.findElement(By.name("login_email")).getAttribute("class"));  //it will print the attribute name
		System.out.println("============================================================");
		Thread.sleep(2000);
		System.out.println("Css Value :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).getCssValue("text-transform"));
		
		System.out.println("Size is :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).getSize());
		System.out.println("location is :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).getLocation());
		System.out.println("Text is :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).getText());
		System.out.println("Tag name is :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).getTagName());
				
		System.out.println("return type is :");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).isDisplayed());  //display return type
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).isEnabled());//true or false 
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).isSelected());//true or false
		
		
		
		driver.quit();

	}

}
