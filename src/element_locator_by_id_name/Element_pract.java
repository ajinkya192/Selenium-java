package element_locator_by_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_pract {

	public static void main(String[] args) {
		
		System.setProperty("web.x.driver", "D:\\chaitu\\chromedriver_win32");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/");
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chiatali");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("wagh");
		//driver.findElement(By.linkText("Practice Site")).click();
		//driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		driver.findElement(By.partialLinkText("Practice")).click();

	}

}
