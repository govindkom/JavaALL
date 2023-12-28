package Sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// LaunchBrowser
		
		// Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// open URL
		driver.get("https://www.javatpoint.com/java-tutorial");

		// get title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		// capture URL of the page
		System.out.println(driver.getCurrentUrl());
		
		// capture pagesource of the page
		System.out.println(driver.getPageSource());
	}

}
