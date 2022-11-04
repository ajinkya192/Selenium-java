package element_locator_by_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver();
		
		aju.manage().window().maximize();
		
		aju.get("https://www.instagram.com/");
		
		aju.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9403315682");
		
		aju.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("ajinkya192");
		
		aju.findElement(By.xpath("//div[text()='Log In']")).click();
		
	

	}

}
