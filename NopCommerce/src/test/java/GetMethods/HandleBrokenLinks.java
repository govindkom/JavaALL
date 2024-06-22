package GetMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	System.out.println("total no of links:"+links.size());

	int noofbrokenlink=0;
	
		for(WebElement link:links) {
			String hrefattval=link.getAttribute("href");
			
			if(hrefattval==null || hrefattval.isEmpty()) {
				System.out.println(" href attribute value is null or empty. so not possible to check");
				continue;
			}
			
			// hit url to the server
			try {
				
			URL linkurl= new URL(hrefattval); // converting href value from string to url format 
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); // open connection to see hte url
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				noofbrokenlink++;
				System.out.println(hrefattval+"============>Broken links");
				//noofbrokenlink++;
			}
			else
			{
				System.out.println(hrefattval+"==========>not a broken links");
			}
			} catch(Exception e) {
				
			}
			
			
		}
		System.out.println("no of broken links"+noofbrokenlink);
	}

}
