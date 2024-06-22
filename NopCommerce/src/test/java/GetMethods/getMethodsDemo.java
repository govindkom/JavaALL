package GetMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		// get url===open url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// get title--- return title of the page
		System.out.println(driver.getTitle());
		
//		// get current url
//		System.out.println(driver.getCurrentUrl());
//		
//		// get page source
//		System.out.println(driver.getPageSource());
//		
//		
//		// getwindowhandle== return ssinlgle browser window id
//		String winid=driver.getWindowHandle();
		
		// getwindowhandles()-- returns multiple browser window id's
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		Set<String> allwin=driver.getWindowHandles();
	}

}
