package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_box {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver ();
		
		aju.manage().window().maximize();
		
		aju.get("https://demoqa.com/text-box");
		
		aju.findElement(By.id("userName")).sendKeys("ajinkya");
		
		aju.findElement(By.id("userEmail")).sendKeys("ajinkya09@gmail.com");
		
		aju.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("manjri pune");
		
		aju.findElement(By.id("permanentAddress")).sendKeys("bramhapuri, chandrapur");
		
		//aju.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		
		
		
		
		
		

	}

}
