package element_locator_by_id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		WebDriver aju = new ChromeDriver();
		
		aju.get("https://www.irctc.co.in/nget/train-search");
		aju.manage().window().maximize();

	}

}
