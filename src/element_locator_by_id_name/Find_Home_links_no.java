package element_locator_by_id_name;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Home_links_no {

	public static void main(String[] args) {
		
		System.setProperty("a.b.c", "D:\\chaitu\\chromedriver_win32");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.findElement(By.id("btn2"));
		
		driver.findElements(By.linkText("a"));
		
		List<WebElement> linktag = driver.findElements(By.tagName("a"));
		System.out.println(linktag.size());

	}

}
