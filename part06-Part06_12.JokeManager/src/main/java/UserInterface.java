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
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                addJoke();
            } else if (command.equals("2")) {
                drawJoke();
            } else if (command.equals("3")) {
                listJokes();
            }
            
        }
    }
    
    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.manager.addJoke(joke);
    }
    
    public void drawJoke() {
        System.out.println(this.manager.drawJoke());
    }
    
    public void listJokes() {
        System.out.println("Printing the jokes");
        this.manager.printJokes();
    }
    
    
}
