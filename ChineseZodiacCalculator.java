package ChineseZodiacCalculator;
import java.util.Scanner;

public class ChineseZodiacCalculator {

	public static void main(String[]args) {
		
// Create a Chinese zodiac calculator using the following for reference and modulus %
		String zodiacAnimals = 
		        "Monkey    " +
		        "Rooster   " +
		        "Dog       " +
		        "Pig       " +
		        "Rat       " +
		        "Ox        " +
		        "Tiger     " +
		        "Rabbit    " +
		        "Dragon    " +
		        "Snake     " +
		        "Horse     " +
		        "Goat      " 
		        ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Year of the Zodiac");
		System.out.print("Please enter your birthyear:");
		int year = scanner.nextInt();
		
		//Calculate the positionInList using Modulus
		int positionInList = year %12;
		
		// Extract their zodiac animal using substring
        String zodiacAnimal = zodiacAnimals.substring(positionInList * 9, (positionInList + 1) * 9);
	
        System.out.println("Your Chinese Zodiac animal is: " + zodiacAnimal.trim());
        scanner.close();
	}
}
