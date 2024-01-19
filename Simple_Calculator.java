package Simple_Calculator;
import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Budget Calculator!");
		System.out.print("How much do you make a month?");
		int income = scanner.nextInt();
		System.out.println("Now let's look at your expenses.");
		System.out.print("How much is your rent? ");
		int rent = scanner.nextInt();
		System.out.print("How much is utilities?");
		int utilities = scanner.nextInt();
		System.out.print("How much is your car insurance?");
		int insurance = scanner.nextInt();

		//Calculation simple savings
		int savings = income - (rent + utilities + insurance);
	
		System.out.println("you should save" + savings);
	}
}
