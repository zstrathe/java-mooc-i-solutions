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
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                this.add();
            } else if (command.equals("list")) {
                this.print();
            } else if (command.equals("remove")) {
                this.remove();
            }
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String addStr = this.scanner.nextLine();
        this.todoList.add(addStr);
    }
    
    public void print() {
        this.todoList.print();
    }
    
    public void remove() {
        System.out.print("which one is removed? ");
        int remId = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(remId);
    }
    
}
