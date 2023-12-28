package InterviewQuestions;

public class startPattern5 {

	public static void main(String[] args) {
		// startPattern5

			    // This is the outer loop which will loop for the rows.
			    for (int i = 1; i <= 4; i++)
			    {
			        // This is the inner loop which loops for the columns
			       // no. of columns = row number for each line here.
			       // Here, we print numbers from 1 to the row number
			       // instead of stars in each row.
			        for (int j = 1; j <= i; j++)
			        {
			            System.out.print(j+" ");
			        }

			         // As soon as numbers for each iteration are printed, we move to the
			        // next row and give a line break otherwise all numbers
			        // would get printed in 1 line.
			        System.out.println();
			    }
			}
}
