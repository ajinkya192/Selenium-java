package element_locator_by_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver aju = new ChromeDriver();
		
		aju.get("https://www.facebook.com/");
		
		aju.manage().window().maximize();
		
		aju.findElement(By.id("email")).sendKeys("ajinkya8");
		
		aju.findElement(By.id("pass")).sendKeys("ajinkya192");
		
		//aju.findElement(By.name("login")).click();
		
		aju.findElement(By.linkText("Forgotten password?")).click();


	}

}
