package TruckOrNotBusiness;
import java.util.Scanner;

public class TruckOrNotBusiness {

	public static void main(String[] args) {

	// This program will determine if you should go into the trucking business
	// Question tree based on these question 1)business exp 2) truck exp 3) capital 4) ROI 3m 5)man power or diy
		
		System.out.println("Welcome to a trucking business program");
		System.out.println("Are you ready to go in business or company drive");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you already have business expereince in any industry? true or false");
		boolean businessExp = scanner.nextBoolean();
		
		System.out.println("Do you have Trucking experience:");
		boolean truckExp = scanner.nextBoolean();

		System.out.println("Do you have the capital");
		boolean hasCapital = scanner.nextBoolean();
		
		System.out.println("Will you have the return of investment in 3 months or less?");
		boolean roiIn3Months = scanner.nextBoolean();
		
		 System.out.print("Will you do it yourself or hire a driver? Enter 'self' or 'hire': ");
	        String manpowerChoice = scanner.next();
	       	        // Decision logic based on the answers
	        if (businessExp && truckExp && hasCapital && roiIn3Months && manpowerChoice.equals("self")) {
	            System.out.println("Congratulations! It looks like you are well-prepared for the trucking business.");
	        } else {
	            System.out.println("It might not be the right time to start the trucking business.");
	        }
	        scanner.close();	        

	}
}