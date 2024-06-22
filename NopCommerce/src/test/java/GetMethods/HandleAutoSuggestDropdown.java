package GetMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> alllist=driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]//li"));
		
		for(WebElement op: alllist) {
			String texxt=op.getText();
			
			if(texxt.contains("selenium")) {
				op.click();
				break;
			}
		}


		
		
		
		
	}

}
