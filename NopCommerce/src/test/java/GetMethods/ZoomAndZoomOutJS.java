package GetMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomAndZoomOutJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.manage().window().minimize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		
		// Zoom 
		js.executeScript("document.body.style.zoom='50%' ");
		
		
		
		System.out.println("working fine");
	}

}
