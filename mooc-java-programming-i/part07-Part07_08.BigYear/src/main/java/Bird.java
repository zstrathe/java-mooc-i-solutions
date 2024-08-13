/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationsNum;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationsNum = 0;
    }
    
    public String toString() {
        return this.name + " (" + latinName + "): " + observationsNum + " observations";
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addObservation() {
        this.observationsNum ++;
    }
}
