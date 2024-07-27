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
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dictionary = dict;
    }
    
    public void start() {
        while (true) {
            System.out.print("Enter a command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("add")) {
               this.add();
            }
            if (command.equals("search")) {
               this.search();
            }
        }
        System.out.println("Bye bye!");
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation); 
    }
    
    public void search() {
        System.out.print("Enter word to be translated: ");
        String word = this.scanner.nextLine();
        String translatedWord = this.dictionary.translate(word);
        if (translatedWord == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translatedWord);
        }
    }
    
   
    
}
