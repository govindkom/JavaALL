package GetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();

		
		// single file upload
		/*
		 * driver.findElement(By.xpath("//input[@name=\"filesToUpload\"]")).
		 * sendKeys("C:\\Users\\shree\\Desktop\\epam questions.txt");
		 * 
		 * 
		 * if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().
		 * equals("epam questions.txt")) { System.out.println("file is uploaded"); }
		 * else { System.out.println("file is not uploaded"); }
		 */
		
	
		
		// 2. multiple files upload
		
		String file1="C:\\Users\\shree\\Desktop\\epam questions.txt";
		String file2="C:\\Users\\shree\\Desktop\\git commands.txt";
		
		driver.findElement(By.xpath("//input[@name=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
		
		
	int noofFileUploaded=	driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();
	
	// 1. Validation 1: no of files
	if(noofFileUploaded==2) {
		System.out.println("all files are uploaded");
	}
	else
	{
		System.out.println("files not uploaded");
	}
		
	
	// 2. validation==valiudate file name
	
	if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("epam questions.txt") &&
			driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("git commands.txt")) {
		System.out.println("file name matching");
	}
	else
	{
		System.out.println("file name not matching");
	}
			
	}

}
