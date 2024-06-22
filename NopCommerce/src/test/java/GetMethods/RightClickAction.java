package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act= new Actions(driver);
		act.contextClick(button).build().perform();
		Thread.sleep(2000);
		
		// click on copy
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li//span[text()='Copy']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		System.out.println("alert handled");

		
		
	}

}
