package WebDriverMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		Alert nayyar = driver.switchTo().alert();
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().getText();
		System.out.println(nayyar.getText());
		//alert.sendKeys("govind");
		//alert.accept();
		nayyar.dismiss();
		
	
		driver.findElement(By.id("radio1")).click();
	}

}
