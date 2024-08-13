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

public class Suitcase {
    private ArrayList<Item> itemsList;
    private int maxWeight;
    private int currWeight;
    
    public Suitcase(int maxWeight) {
        this.itemsList = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currWeight = 0;
    }
    
    public void addItem(Item item) {
        if (!(this.itemsList.contains(item))) {
            if (this.currWeight + item.getWeight() <= this.maxWeight) {
                this.itemsList.add(item);
                this.currWeight += item.getWeight();
            }
        }
    }
    
    public String toString() {
        if (this.itemsList.size() == 0) {
            return "no items (0 kg)";
        }
        
        String retString = this.itemsList.size() + " item";
        if (this.itemsList.size() != 1) {
            retString += "s";
        }
        retString += " (" + this.currWeight + " kg)";
        return retString;
    }
    
    public void printItems() {
        for (Item item: this.itemsList) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.currWeight;
    }
    
    public Item heaviestItem() {
        if (this.itemsList.size() == 0) {
            return null;
        }
        
        Item heaviest = this.itemsList.get(0);
        for (Item item: this.itemsList) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public ArrayList<Item> getItems() {
        return this.itemsList;
    }
}
