package GetMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleStaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,600)","");
		js.executeScript("window.scrollBy(0,1200)", "");
		
		//1) count total no of rows
		
		int rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println(rows);
		
		//2) find total no of colums(th)
		int cols=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println(cols);
		
		//3) capture data from specific row and specific column
		String bookname=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]/td[1]")).getText();
		System.out.println(bookname);
		
		//4) Read data from all rows and cols
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String text=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(text+"\t");
			}
			System.out.println();
		}
		
	}

}
