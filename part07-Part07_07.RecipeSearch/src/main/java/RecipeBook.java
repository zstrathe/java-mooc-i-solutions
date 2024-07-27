/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public RecipeBook(String filename) {
        this.recipes = new ArrayList<>();
        this.scanFile(filename);
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public void searchByName(String name) {
        System.out.println("");
        System.out.println("Recipes:");
        
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByMaxTime(int maxTime) {
        System.out.println("");
        System.out.println("Recipes:");
        
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByIngredient(String ingredient) {
        System.out.println("");
        System.out.println("Recipes: ");
        
        for (Recipe recipe: this.recipes) {
            if (recipe.containsIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void scanFile(String filename) { 
        File fileObj = new File(filename);
        try (Scanner fileScanner = new Scanner(fileObj)) {
            
            int lineCount = 0;
            String recipeName = "";
            int cookTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    if (!(recipeName.equals("")) && cookTime != 0) {
                        this.addRecipe(new Recipe(recipeName, cookTime, ingredients));
                        recipeName = "";
                        cookTime = 0;
                        ingredients = new ArrayList<>();
                    }
                    lineCount = 0;
                    continue;
                }
                
                if (lineCount == 0) {
                    recipeName = line;
                } else if (lineCount == 1) {
                    cookTime = Integer.valueOf(line);
                } else {
                    ingredients.add(line);
                }
                lineCount ++;
            }
            // add the last recipe from the file since it isn't caught by a new empty line
            if (!(recipeName.equals("")) && cookTime != 0) {
                this.addRecipe(new Recipe(recipeName, cookTime, ingredients));
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
