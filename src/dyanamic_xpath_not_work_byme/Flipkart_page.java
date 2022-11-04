package dyanamic_xpath_not_work_byme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_page {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver();
		
		aju.manage().window().maximize();
		
		aju.get("https://www.flipkart.com/");
		
		//aju.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		aju.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9403315682");
		
		aju.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("ajinkya192");
		
		aju.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		aju.findElement(By.xpath("//a[contains (text(),'MOTOROLA ta')]/../../../..//div[@class='_3dsJAO'][2]")).click();  //dyanamic path
		
		
		
		

	}

}
