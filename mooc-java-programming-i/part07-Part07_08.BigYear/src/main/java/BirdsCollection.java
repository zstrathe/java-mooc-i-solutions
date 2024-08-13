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

public class BirdsCollection {
    private ArrayList<Bird> allBirds;
    
    public BirdsCollection() {
        this.allBirds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        allBirds.add(newBird);
    }
    
    public void addObservation(String name) {
        if (this.containsBird(name)) {
            Bird bird = this.getBirdByName(name);
            bird.addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll() {
        for (Bird bird: this.allBirds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: this.allBirds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
    }
    
    public boolean containsBird(String name) {
        for (Bird bird: this.allBirds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public Bird getBirdByName(String name) {
        for (Bird bird: this.allBirds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
}
