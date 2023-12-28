package Sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsGetAttributeValue {

	public static void main(String[] args) {
		// getTextVsGetAttributeValue
		
		//getText()=-==> mehtod returns the inner text of an element
		//getAttribute()===> method fetches the text contained by an attribute in an html document
		
		// setup Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		//email.clear();
		//email.sendKeys("abc@gmail.com");
		
		// capturing text from input box
		System.out.println("result from get attribute method:"+email.getAttribute("value"));
		System.out.println("result from get Text method:"+email.getText());

		System.out.println(driver.findElement(By.xpath("//button[@type=\"submit\"]")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath("//button[@type=\"submit\"]")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText());
	}

}
