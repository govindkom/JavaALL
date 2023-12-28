package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigations {

	public static void main(String[] args) {
		// BrowserNavigations command
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		//driver.get("https://demo.nopcommerce.com/register");
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().back();  // back to page
		driver.navigate().forward(); // forward page
		
		driver.navigate().refresh();  // refresh or reload the page
	}

}
