package TestNGDEmo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testone {
		@Test( dataProvider="getData")
	public void LoginTest(String username, String password) {
		System.out.println("Succesfully logged in using username:"+username+"and password:"+password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="arun";
		data[0][1]="12345";
		
		data[1][0]="varun";
		data [1][1]="4567";
		
		data[2][0]="tharun";
		data[2][1]="9123";
		
		return data;
		
	}
}
