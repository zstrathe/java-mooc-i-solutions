/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdsCollection birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new BirdsCollection();
    }
    
    public void run() {
        while (true) {
            System.out.print("? ");

            String optChoice = this.scanner.nextLine();

            if (optChoice.equals("Quit")) {
                break;
            }
            
            if (optChoice.equals("Add")) {
                this.choiceAdd();
            } else if (optChoice.equals("Observation")) {
                this.choiceObservation();
            } else if (optChoice.equals("All")) {
                this.choiceAll();
            } else if (optChoice.equals("One")) {
                this.choiceOne();
            }
            
        }
    }
    
    public void choiceAdd() {
        System.out.print("Name: ");
        String birdName = this.scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        this.birds.addBird(birdName, latinName);
    }
    
    public void choiceObservation() {
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        this.birds.addObservation(name);
    }
    
    public void choiceAll() {
        this.birds.printAll();
    }
    
    public void choiceOne() {
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        this.birds.printOne(name);
    }
}
