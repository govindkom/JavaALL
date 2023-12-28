package Programss;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// GenerateRandomNumber
		
		Random rand= new Random();
		int randint=rand.nextInt(1000);
		System.out.println(randint);
		
		
		// double
	double randdb=rand.nextDouble(100);
	System.out.println(randdb);
	
	// Approach 2-===> using ,math class
	System.out.println(Math.random());
	
	
	// Approach 3===> using third party apache POI
	//String randnum=RandomStringUtils.randomNumeric(100);

	}

}
