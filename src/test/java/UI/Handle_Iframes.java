package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.switchTo().frame(3); //By index  // 2 frames then select particular index
		
		//driver.switchTo().frame("//iframe[@id='iframeResult']");  //by name Or id 
		
		WebElement frames = driver.findElement(By.id("iframeResult"));  //by webelement
		driver.switchTo().frame(frames);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();  // here it will not click on particular website because there are multiple frames 
		
		driver.switchTo().parentFrame();  //it will switch to parent page
		System.out.println(driver.getTitle()); 
		Thread.sleep(2000);
		driver.close();

	}

}
