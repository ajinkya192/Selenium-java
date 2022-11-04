package basic_of_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		
		WebDriver ajinkya = new ChromeDriver();
		
		ajinkya.get("https://www.instagram.com/");
		
		ajinkya.manage().window().maximize();

	}

}
