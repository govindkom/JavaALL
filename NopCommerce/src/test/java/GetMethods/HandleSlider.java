package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		// handle slider 
		// capture x & y coordinate
		
		WebElement minslider=driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		System.out.println(minslider.getLocation());
		
		System.out.println(minslider.getLocation().getX());
		System.out.println(minslider.getLocation().getY());
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(minslider, 158, 250).perform();
		
		System.out.println(minslider.getLocation());
		
		
		WebElement maxslider=driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[2]"));
		
		Thread.sleep(2000);
	act.dragAndDropBy(maxslider, -50, 100).perform();
	
	System.out.println("rpgram ended");
		
	driver.close();

	}

}
