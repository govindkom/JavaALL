package GetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		
		WebDriver driver= new ChromeDriver(option);
				
	
	
	}

}
