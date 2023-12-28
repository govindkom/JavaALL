package Sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultipleHandle {

	public static void main(String[] args) {
		// DropdownMultipleHandle
		
		// setup browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement oldval=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		
		
		

	}

}
