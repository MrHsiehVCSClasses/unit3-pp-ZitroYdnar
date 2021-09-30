package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * This is where the code starts to recognize and state what year the user wants to know is a leap year or if i is not a leap howvr there is also a function of stopping by asking.
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			/* YOUR CODE HERE */
		
			int year = Integer.parseInt(input);
		if (LeapYear.isLeapYear(year))
		{
		  System.out.print(year + " is a leap year");
		}
		else{
		  System.out.print(year + " is not a leap year");
		}
			
			System.out.print("Enter a year (or enter STOP to end): ");
						//YOUR CODE HERE
	     input = sc.nextLine();
      
		}
		//YOUR CODE HERE
    sc.close();
	}
}