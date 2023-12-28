package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement male= driver.findElement(By.id("gender-male"));
		System.out.println(male.isDisplayed());  //true
		Assert.assertTrue(male.isDisplayed());
		
//		if(male.isDisplayed()==true) {
//			return true;
//		}
//		elseo
//		{
//			return false;
//		}
//		
	male.click();
//		
//		
		
		WebElement female= driver.findElement(By.id("gender-female"));
		System.out.println(female.isEnabled()|| female.isSelected());
		
		female.click();
		
		Thread.sleep(2000);
		
		System.out.println(male.isSelected());
		driver.close();
	}

}
