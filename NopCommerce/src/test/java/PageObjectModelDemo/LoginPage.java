package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	// construcro====> initiate the driver
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	// Locators
	By txt_username_loc= By.xpath("//input[@name='username']");
	By txt_password_loc= By.xpath("//input[@name='password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	
	
	
	
	//Action Methods
	public void setUSerName(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
	
	
	
	
	
	
	
}
