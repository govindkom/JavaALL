package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		// HandleDropDown
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement drpCountry=driver.findElement(By.id("input-country"));// webelement xpath for dropdown
		// creating Select class object
		
		Select select= new Select(drpCountry);
//		select.selectByVisibleText("Algeria");
//		select.selectByValue("10");
//		select.selectByIndex(2);
		
		// selecting option from dropdown without using methods
		List<WebElement>alloptions=select.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Denmark"))
			{
				option.click();
				break;
			}
		}
		
		// if 
	}

}
