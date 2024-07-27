
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        RecipeBook recipes = new RecipeBook(filename);
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
                
            } else if (command.equals("list")) {
                recipes.printRecipes();
                
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                recipes.searchByName(searchWord);
                
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                recipes.searchByMaxTime(maxTime);
            
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientSearch = scanner.nextLine();
                recipes.searchByIngredient(ingredientSearch);
            }
        }
        
    }
}
