package DiceGame;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to the dice game, roll your dice pay the price");
	
	System.out.print("Enter your field bet:");
	int field = scanner.nextInt();
	
//	System.out.print("Enter your bet:");
//	int bet = scanner.nextInt();
	
	Random diceNumber = new Random();
	int x = diceNumber.nextInt(6)+1;
	int y = diceNumber.nextInt(6)+1;
	int sum = x +y;
	
	System.out.println("The dice roll " + x + " and " + y + ", Totaling " + sum);
	
	if (sum <= 4) {
	    int fieldSum= field *2 + field;
		System.out.println("You win the field bet for a sum of 4 or less!");
		System.out.println("You win " + fieldSum);
	} else if (sum >= 9) {
	    int fieldSum= field * 2 + field;
		System.out.println("You win the field bet for a sum of 9 or greater!");
		System.out.println("You win " + fieldSum);
	} else {
	    System.out.println("You didn't win this time.");
	    System.out.println("You lost " + "-$" + field);
	}	
	scanner.close();
}
}
