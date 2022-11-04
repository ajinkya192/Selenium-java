package element_locator_by_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver();
		
		aju.manage().window().maximize();
		
		aju.get("https://demo.actitime.com/login.do");
		
		aju.findElement(By.xpath("//input [@name='username']")).sendKeys("admin");
		
		aju.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		aju.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		aju.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
