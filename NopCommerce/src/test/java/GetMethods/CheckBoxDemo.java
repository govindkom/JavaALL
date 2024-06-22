package GetMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		// select the checbox
		
//		WebElement checkbox=driver.findElement(By.id("sunday"));
//		checkbox.click();
//		
//		System.out.println("after selection:"+checkbox.isSelected());
		
		// count all checkboxes is present
		
		
		
	List<WebElement> allch=	driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
	System.out.println(allch.size());
	
//	for(int i=0;i<=allch.size()-1;i++) {
//		allch.get(i).click();
//	}
	
	// select checkboxes aper choice like last 2 pr 3
	
	// total no of checkboxes-how manu checlkboxes u want to select
	
	for(int i=4;i<allch.size();i++) {
		allch.get(i).click();
	}
	}

}
