package element_locator_by_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver();
		
		aju.manage().window().maximize();
		
		aju.get("https://www.facebook.com/");
		
		aju.findElement(By.xpath("//input[@type='text']")).sendKeys("ajinkya8");
		
		aju.findElement(By.xpath("//input[@type='password']")).sendKeys("ajinkya192");
		
		aju.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		

	}

}
