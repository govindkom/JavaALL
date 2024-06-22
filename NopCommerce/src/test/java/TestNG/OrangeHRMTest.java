package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {
  
//	1) open application
//
//2) test logo presence
//3) login
//4) close
	
	WebDriver driver;
	
	
	@Test(priority=1)
	void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test(priority=2) 
	void testLogo()
	{
	boolean status=	driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(status);
		
	}
	
	@Test(priority=3) 
	void testLogin()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@Test(priority=4)
	void close() {
		driver.close();
	}
	
	
	
	
	
	
}
