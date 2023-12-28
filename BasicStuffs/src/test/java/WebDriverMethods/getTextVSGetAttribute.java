package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVSGetAttribute {

	public static void main(String[] args) {
		// getTextVSGetAttribute
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=driver.findElement(By.id("Email"));
//		email.clear();
//		email.sendKeys("adm123@gmail.com");
		//WebElement pass= driver.findElement(By.id("Password"));
		
		// capturing text from input box
		System.out.println("result from get attribute methos:"+email.getAttribute("value"));

	}

}
