package NintyNineBottlesOfBeerOnTheWall;

public class NintyNineBottlesOfBeerOnTheWall {

	public static void main(String[]args) {
		// Completing the song NintyNineBottlesOfBeerOnTheWall
		// (n) bottles of beer on the wall. 
		// (n) bottles of beer. Take one down, 
		// pass it around, (n-1) bottles of beer on the wall.
		System.out.println("Let's all sing together and drrrrrink together");
		int bottles = 99;
		for (int i =bottles; i >0; i--) {
		System.out.println(i + " bottles of beer on the wall");
		System.out.println(i + " bottles of beer on the wall. Take one down,");
		System.out.println("pass it around, " + (i-1) + " bottles of beer on the wall.");
		System.out.println("");
		// Adding a 1-second delay
        try {
            Thread.sleep(4000); // 1000 milliseconds = 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
		}
}
