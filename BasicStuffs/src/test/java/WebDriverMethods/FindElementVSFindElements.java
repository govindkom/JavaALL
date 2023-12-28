package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		// FindElementVSFindElements
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
//		// 1. find Element ()====> Return the single element
//		WebElement search=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
//		search.sendKeys("abc");
//		
//		// 2 return first element from no of element
	//WebElement ele=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
//		System.out.println(ele.getText());

		
//		// 3 FindElements()===always return multiple web element  
	List<WebElement> links=	driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
	System.out.println("no of element captured:"+links.size());
//	
//	 //to get each and every element from list we have to use loop to iterate this
//	for(int i=0;i<links.size();i++) {
//		String text=links.get(i).getText();
//		

//	}
//		
//	//2 for each loop
	for (WebElement webt : links) {
		System.out.println(webt.getText());
		
	}
		
//		
//		
}

}
