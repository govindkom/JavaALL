package GetMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

	
		driver.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]")).click();
		
		//1) click on single check box===simplify find xpath and use click ()
				
		//2) capture all checkboxes
		
	List<WebElement> alloptions=	driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//li"));
	
	System.out.println(alloptions.size());
	
	
	
	// print all options
	/*
	 * // // for(WebElement option:alloptions) { //
	 * System.out.println(option.getText()); // }
	 */	
	
	
	// select multiple options
	
	for(WebElement op: alloptions) {
		String text=op.getText();
	if(text.equals("Java") || text.equals("Python")) {
		op.click();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
