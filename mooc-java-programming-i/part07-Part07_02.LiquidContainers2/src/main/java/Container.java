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

public class Container {
    private int volLevel;
    
    public Container() {
        this.volLevel = 0;
    }
    
    public int contains() {
        return this.volLevel;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.volLevel += amount;
            if (this.volLevel > 100) {
                this.volLevel = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.volLevel -= amount;
            if (this.volLevel < 0) {
                this.volLevel = 0;
            }
        }
    }
    
    public String toString() {
        return this.volLevel + "/100";
    }
}
