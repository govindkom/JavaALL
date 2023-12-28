package Sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
							FindElement()							Find Elements()
======================================================================================
1) Single Element       	Return Single Element					Return Single Element	
2) Multiple Element	        Return Single Element					Return Multiple Element
3) Element not Present	 	Throws NoSuch Element Exception 		Does not throw Exception Return Zero Elements
4)Return Type				WebElement								List<WebElement>
5) Access 					Directly								Iterate the list of Element		

	FindElement()==>1) methos return the first matching element on the current page.
					2) If the element is not found then it shows NoSuchElementFoundException
					
	FindElements()==>1) Method return all the matching elements on the current page and it doesn't throw any exception 
						if the element is not found, instaead it will return zero element.
						
*/
		// setup Driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//1)  Find Element()=====> return the singlew Element
		WebElement searchlogo=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		searchlogo.sendKeys("Welcome");
		
		// 2) find Element with muliple element===> return first single element
		WebElement elem=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
		System.out.println(elem.getText());
		
		// 3) Find Element()====> if element not present throws No usch ELement Exception
		
		//1)  find Elements()===> return single Element 
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
		System.out.println(ele.size());
		for(WebElement el:ele) {
			String links=el.getText();
			System.out.println(links);
		}
		
		// 2)Find Elements()====> return single Element only
		List<WebElement> logo1=driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println(logo1.size());
		
		
		//3) FindElements()===> if Element not match will return Zero instead of givinf any error or exception
	}

}
