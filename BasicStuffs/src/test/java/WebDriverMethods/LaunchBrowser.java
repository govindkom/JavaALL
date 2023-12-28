package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		//LaunchBrowser
		
		// Launch Browser
		//open URL
		// capture Title of the page
		// capture URL of the page
		// capture page source of the page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//open URL
		driver.get("https://mvnrepository.com/");

		// capture Title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		// capture URL of the page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		// capture page source of the page
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

}
