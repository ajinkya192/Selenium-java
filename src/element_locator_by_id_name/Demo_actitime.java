package element_locator_by_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_actitime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver aju = new ChromeDriver();
		
		aju.get("https://demo.actitime.com/login.do");
		
		aju.manage().window().maximize();
		
		aju.findElement(By.id("username")).sendKeys("admin");
		
		aju.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(4000);
		
		aju.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(4000);
		
		aju.findElement(By.linkText("Return to login page")).click();
		
		

	}

}
