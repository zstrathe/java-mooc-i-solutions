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

public class Hold {
    private int maxWeight;
    private int currWeight;
    private ArrayList<Suitcase> holdList;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currWeight = 0;
        this.holdList = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (!(this.holdList.contains(suitcase))) {
            if (this.currWeight + suitcase.totalWeight() <= this.maxWeight) {
                this.holdList.add(suitcase);
                this.currWeight += suitcase.totalWeight();
            }
        }
    }
    
    public String toString() {
        if (this.holdList.size() == 0) {
            return "No suitcases";
        }
        String retStr = this.holdList.size() + " suitcase";
        if (this.holdList.size() != 1) {
            retStr += "s";
        } 
        retStr += " (" + this.currWeight + " kg)";
        return retStr;
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.holdList) {
            suitcase.printItems();
        }
    }
}
