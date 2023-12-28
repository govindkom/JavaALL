package Sdet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropDown {

	public static void main(String[] args) {
		// HandleJQueryDropDown
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		selectChoiceValues(driver,"choice 1");
//		selectChoiceValues(driver,"Choice1","Choice","Choice 1 ");
//		selectChoiceValues(driver,"all");
//			
		
	}
	
	public static void selectChoiceValues(WebDriver driver, String...value)
	{
		List<WebElement>choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement el:choicelist) {
				String text=el.getText();
				
				for(String val:value) {
					if(text.equals(val)) {
						el.click();
						break;
						
					}
				}
			}
		}
		else
		{
			for(WebElement el:choicelist) {
				el.click();
			}
		}
	}

}
