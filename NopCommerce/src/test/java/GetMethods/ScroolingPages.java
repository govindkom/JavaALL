package GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScroolingPages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//1. scrooll page by some pixel
//		js.executeScript("window.scrollBy(0,800)", " ");
//		
//		// capture resoltuon==> print pixels
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		// 2. scroll page u[pto able to see parametr as specific element visible
		
//		WebElement ele=driver.findElement(By.xpath("//*[text()='Community poll']"));
//		js.executeScript("arguments[0].scrollIntoView()", ele);
//		
//		System.out.println(js.executeScript("retur window.pageYOffset;"));
		
		//3. scroll page end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//4. scroll back to initial position or top position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
