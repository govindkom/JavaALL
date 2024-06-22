package GetMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//1) Full page Screenshots
		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//	File sourcefile=	ts.getScreenshotAs(OutputType.FILE);
//	
//	//File targetfile=new File("H:\\EclipseNewWorkspace\\NopCommerce\\screenshots\\fullpage.png"); // hardcoded
//	
//	// dyanamically value of that project by creating screenshot folder inside project only
//	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
//	
//	sourcefile.renameTo(targetfile);  // copy source file to target file
//	
	//2) capture the ss of specific section
	
//	WebElement ele=driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
//	
//	File sourcefile=ele.getScreenshotAs(OutputType.FILE);
//	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featureproducyt.png");
//	sourcefile.renameTo(targetfile);   // copy source to target
//	
//	// if we are getting ss of specific are no need to create object for Takesscreenshot(no need to typecast)
	
	
	//3) capture ss of webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	File sourcefile=	logo.getScreenshotAs(OutputType.FILE);
	File targetfile= new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
	
	sourcefile.renameTo(targetfile);
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
