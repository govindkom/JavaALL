package com.NopCommerce.demo.NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set path to your ChromeDriver
WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver(); // Launch Chrome browser

		        try {
		            // 1) Launch Chrome and open amazon.com
		            driver.get("https://www.amazon.com/");

		            // 2) Search for "laptop"
		            WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		            searchBar.sendKeys("laptop");
		            searchBar.submit();

		            // 3) Wait for search results to load (optional, adjust timeout as needed)
		          //  WebDriverWait wait = new WebDriverWait(driver, 10);
		            //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".s-result-list")));

		            // 4) Get all laptop elements on the first page
		            List<WebElement> laptopElements = driver.findElements(By.cssSelector(".s-result-list .s-product-grid"));

		            // 5) Process each laptop element
		            List<String> laptopNames = new ArrayList<>();
		            double lowestPrice = Double.MAX_VALUE, highestPrice = Double.MIN_VALUE;
		            for (WebElement laptopElement : laptopElements) {
		                String laptopName = laptopElement.findElement(By.tagName("h2")).getText().trim();
		                laptopNames.add(laptopName);

		                // Extract and parse price (handle price variations and potential exceptions)
		                try {
		                    WebElement priceElement = laptopElement.findElement(By.cssSelector(".s-price"));
		                    String priceString = priceElement.getText().trim().replaceAll("[$,]", "");
		                    double price = Double.parseDouble(priceString);
		                    if (price < lowestPrice) {
		                        lowestPrice = price;
		                    }
		                    if (price > highestPrice) {
		                        highestPrice = price;
		                    }
		                } catch (NumberFormatException e) {
		                    // Handle cases where price is not available or in a different format
		                    System.out.println("Price unavailable or invalid format for: " + laptopName);
		                }
		            }

		            // 6) Print all laptop names
		            System.out.println("Laptops found on Amazon (first page):");
		            for (String laptopName : laptopNames) {
		                System.out.println("- " + laptopName);
		            }

		            // 7) Print lowest and highest prices (if found)
		            System.out.println("\nLowest price found (excluding unavailable prices): $" + lowestPrice);
		            System.out.println("Highest price found (excluding unavailable prices): $" + highestPrice);
		        } finally {
		            driver.quit(); // Close the browser window
		        }
		    }
		

	}


