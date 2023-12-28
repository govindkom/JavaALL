package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set driver
		//2 ways
		
		//WebDriverManager.chromedriver().setup();   //webdriver 3 
		WebDriver driver= new ChromeDriver();  
		
		// maximize URL
		driver.manage().window().maximize();
		
		// launch URL
		driver.get("https://demo.nopcommerce.com/register");
		
		
		// title 
		//String title=driver.getTitle();
		
		//System.out.println(title);
		
	//	System.out.println(driver.getTitle());
		
//		if(title.equals("QKart12")) {
//			System.out.println("title is matching");
//		}
//		else
//		{
//			System.out.println("title is not matching");
//		}
//		
	
		//Assert.assertEquals(driver.getTitle(), "QKart","title is not matching");
	
//		String actual = driver.getTitle();
//		String expected = "QKart";
//		Assert.assertEquals(actual, expected,"title is not matching");
//		
//		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		System.out.println("testing done");
		
		// close
		 driver.close();
		 
		
	
		//quit()
		//driver.quit();

	
	}

}
