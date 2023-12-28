package TestNGDEmo;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTen {

	
	public void testTen() {
		int a=2;
		int b=5, c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		if(a==1) {
			Assert.assertTrue(b<c);
		}else if(a==2) {
			Assert.assertTrue(b>c);
		}else if(a==3) {
			throw new SkipException("Test Skipped");
		}
		driver.quit();
	
	}
}
