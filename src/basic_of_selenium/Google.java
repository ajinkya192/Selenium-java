package basic_of_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		WebDriver aju = new ChromeDriver();
		aju.get("https://www.google.com/");
		aju.manage().window().maximize();

	}

}
