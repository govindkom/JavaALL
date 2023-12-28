package WebDriverMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");//  main window
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();// first window
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("tabButton")).click();// second window
		System.out.println(driver.getTitle());
		
		
		// parent window
		//String parentwindow = driver.getWindowHandle();
		
		// child window
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String>itr=windowids.iterator();
		while(itr.hasNext()) {
			String windowid =itr.next();
			driver.switchTo().window(windowid);
		}
		
		
	Thread.sleep(3000);
//	driver.switchTo().window(windoww);
	String text=	driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	}

}
