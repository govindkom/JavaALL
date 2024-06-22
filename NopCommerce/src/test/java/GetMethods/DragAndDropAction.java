package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		// Drag And Drop
		
		Actions act= new Actions(driver);
		
		
		WebElement rome=driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		WebElement italy= driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		
		
		act.dragAndDrop(rome, italy).perform();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
