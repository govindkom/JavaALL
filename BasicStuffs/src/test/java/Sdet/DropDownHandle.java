package Sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// DropDownHandle
		
		/* for DropDown we have special Tag  =-=> "Select"
		// 3 mehtods===>1) selectByVisibleText();
						2) SelectByVisibleValue();
						3) selectByIndex();
						
						*/
						
		// setup Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		//Thread.sleep(10000);
		WebElement drpcountry=driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]"));
		
		Select sel= new Select(drpcountry);
		//sel.selectByVisibleText("Denmark");
		//sel.selectByValue("10");
		//sel.selectByIndex(10);

		
		// selecting option from dropdown without using method
		List<WebElement> ele=sel.getOptions();
		for (WebElement webElement : ele) {
			if(webElement.getText().equals("Cuba")){
				webElement.click();
				break;
			}
			
		}
	}

}
