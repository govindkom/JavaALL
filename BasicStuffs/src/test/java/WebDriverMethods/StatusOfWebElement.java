package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		// IsDisplayedIsEnabledIsSelected
		
		// isDisplayed()---if WebElement is present
		// isEnabled()====> if WebElement is enabled 
		// isSelected()====> if WebElement is selected
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		
		// isDisplayed     isEnabled()
		
		WebElement searchstore=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		System.out.println("Display Status:"+searchstore.isDisplayed());				// is displayed ()
		
		System.out.println("enable status:"+searchstore.isEnabled());					// is enabled ()
		
		
		// is Selected
		WebElement male=driver.findElement(By.id("gender-male"));
		
		WebElement female=driver.findElement(By.id("gender-female"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		// select male radio button
		male.click();
		
		//after selecting male radio button again checking
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		female.click();
		
		//after selecting female radio button again checking
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
	
	}

}
