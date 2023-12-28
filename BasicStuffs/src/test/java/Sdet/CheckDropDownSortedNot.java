package Sdet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSortedNot {

	public static void main(String[] args) {
		// CheckDropDownSortedNot
		
		// disable permission based pop-ups
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--Disable-notifications");
		

		// setup driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		
		// url
		driver.get("https://twoplugs.com/newsearchserviceneed");
		
		WebElement ele=driver.findElement(By.xpath("//select[@name='category_id']"));
		Select sel= new Select(ele);
		
		List<WebElement>alloption=sel.getOptions();
		
		ArrayList originallist= new ArrayList<>();
		ArrayList templist= new ArrayList<>();
		
		for(WebElement option:alloption) {
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		System.out.println("original list before sort:"+originallist);
		System.out.println("templist before sort:"+templist);
		
		Collections.sort(templist);
		
		System.out.println("original list after sort:"+originallist);
		System.out.println("templist before after:"+templist);
		
		if(originallist.equals(templist)) {
			System.out.println("dropdown sorted....");
		}
		else
		{
			System.out.println("dropdown unsorted");
		}
	}

}
