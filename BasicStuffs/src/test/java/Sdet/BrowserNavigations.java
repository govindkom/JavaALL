package Sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigations {

	public static void main(String[] args) {
		// BrowserNavigations
		
		// setup Driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		// Launch URL
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.amazon.in/");// does not wait to page load.
		
		
		driver.navigate().back();// will come back 
		driver.navigate().refresh(); // refresh or reload the page
		driver.navigate().forward();// forward the page
		
			/*get()==>get is used to navigate particular URL(website) and wait till page load driver
				
		Navigate().to()==> is used to navigate to particular URL and does not wait to page load. 
		It maintains browser history or cookies to navigate back or forward.*/

	}

}
