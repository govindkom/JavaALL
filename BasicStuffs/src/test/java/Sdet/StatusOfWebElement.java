package Sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		// StatusOfWebElement
		
		// Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		// launch URL
		driver.get("https://demo.nopcommerce.com/register");
		
		// 1) isDisplayed ()    && 2) isEnabled()======> both return boolean value as output
		WebElement logo=driver.findElement(By.id("small-searchterms"));
		System.out.println(logo.isDisplayed());
		System.out.println(logo.isEnabled());
		
		// 3) isSelected() ===> mostly used for radio button, checkbox or dropdown ===> always return as boolean values
		WebElement malebtn=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		System.out.println("Before selecting btn:"+malebtn.isSelected());
		Thread.sleep(2000);
		
		malebtn.click();
		System.out.println("after selecting btn:"+malebtn.isSelected());
		
		

	}

}
