package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		
		driver.get("https://demo.opencart.com/");
		
	WebElement desktop=	driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
		Thread.sleep(2000);
	WebElement mac=	driver.findElement(By.xpath("//a[text()=\"Mac (1)\"]"));
	
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	
	
	
	}

}
