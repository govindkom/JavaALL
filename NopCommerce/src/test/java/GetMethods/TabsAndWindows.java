package GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// demo for JavaScript Executor
		
		// sendkeys ()
		// click()
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.id("name"));
		
		
		// passing text into input box===in case of sendkeys method
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','john')", name);

		
		WebElement radio=driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", radio);
		
		js.executeScript("window.scrollBy(0,800)", "");
		System.out.println("page scrolled");
		
		System.out.println("clicked");
		driver.close();
		
		
	}

}

