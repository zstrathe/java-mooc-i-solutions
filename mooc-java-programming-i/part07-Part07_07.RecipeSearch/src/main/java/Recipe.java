/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
import java.util.ArrayList;

public class Recipe {
    private int cookingTime;
    private String name;
    private ArrayList<String> ingredientsList;
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookTime;
        this.ingredientsList = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookingTime;
    }
    
    public boolean containsIngredient(String ingredientToSearch) {
        for (String item: this.ingredientsList) {
            if (item.equals(ingredientToSearch)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
    
    
}
