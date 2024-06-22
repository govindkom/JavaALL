package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"field1\"]")).sendKeys("hello");
		
		Thread.sleep(2000);
		
		// double click actions
		
		WebElement secbox=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(secbox).build().perform();
		
		
		// second element
	String text=	driver.findElement(By.xpath("//input[@id=\"field2\"]")).getAttribute("value");
	
	// validate both values arwe sameor not
	
	if(text.equals("hello")) {
		System.out.println("text copied");
	}
	else
	{
		System.out.println("text not copied");
	}
	
	
		
		
		
	}

}
