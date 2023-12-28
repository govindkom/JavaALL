package InterviewQuestions;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		// FindMissingNumberinArray
		
		int a[]= {1,2,4,5};
		int totalsum=0;
				for(int i=0;i<a.length;i++) {
					totalsum=totalsum+a[i];
				}
		System.out.println(totalsum);
		
		int sum=0;
		for(int j=1;j<=5;j++) {  // here we have to give last digit from array list
			sum=sum+j;
		}
		System.out.println(sum);
		
		System.out.println(",missing no is:"+(totalsum-sum));

	}

}
