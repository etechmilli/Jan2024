package RecipeList;
import java.util.Random;

public class RecipeList {

	public static void main(String[] args) {
		//create a list of recipes and another list for ingredients
		
		String [] recipes = new String[10];
		recipes[0] = "CURRY CHICKEN WITH ONION";
		recipes[1] = "BEEF WITH BROCCOLI";
		recipes[2] = "SHRIMP WITH LOBSTER SAUCE";
		recipes[3] = "SHRIMP WITH BROCCOLI";
		recipes[4] = "CHICKEN WITH BROCCOLI";
		recipes[5] = "CURRY SHRIMP WITH ONIONS";
		recipes[6] = "SHRIMP EGG FOO YOUNG";
		recipes[7] = "MUU SHU CHICKEN";
		recipes[8] = "MUU SHU SHRIMP";
		recipes[9] = "SCALLOP WITH GARLIC SAUCE";
	
		
		// generate a random index to select a recipe
        Random random = new Random();
        int randomIndex = random.nextInt(recipes.length);
		
	System.out.println("Number of recipes in this list is: " + recipes.length);
	System.out.println("default recipe should be: " + recipes[4]);
	System.out.println("The meal you should prepare today should be: " + recipes[randomIndex]);
	
	}
}
