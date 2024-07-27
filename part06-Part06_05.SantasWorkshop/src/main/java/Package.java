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

public class Package {
   private ArrayList<Gift> pkg;
   
   public Package() {
       this.pkg = new ArrayList<>();
   }
   
   public void addGift(Gift gift) {
       this.pkg.add(gift);
   }
   
   public int totalWeight() {
       int totalWeight = 0;
       for (Gift g: this.pkg) {
           totalWeight += g.getWeight();
       }
       return totalWeight;
   }
   
}
