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
    private IntegerContainer inputContainer;
    private Scanner scanner;
    
    public UserInterface() {
        this.inputContainer = new IntegerContainer();
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            this.inputContainer.add(input);
        }
        System.out.println("Point average (all): " + this.inputContainer.getAverage());
        System.out.println("Point average (passing): " + this.inputContainer.getAveragePassing());
        System.out.println("Pass percentage: " + this.inputContainer.getPercentagePassing());
        System.out.println("Grade distribution:");
        this.inputContainer.printGradeDistribution();
    }
    
}
