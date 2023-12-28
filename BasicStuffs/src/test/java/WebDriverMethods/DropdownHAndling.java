package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHAndling {

	public static void main(String[] args) throws InterruptedException {
		// DropdownHAndling
		
		// single dropdown
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("drop1")).sendKeys("doc 3");
		
//		WebElement ele=driver.findElement(By.id("drop1"));
//		ele.click();
//		Select sel=new Select(ele);
//		
//		Thread.sleep(2000);
//		//sel.selectByVisibleText("doc 3");
//		sel.selectByValue("jkl");
//		sel.selectByIndex(14);
//		
		

	}

}
