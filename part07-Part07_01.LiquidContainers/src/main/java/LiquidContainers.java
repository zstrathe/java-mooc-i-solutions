
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOneVol = 0;
        int containerTwoVol = 0;

        while (true) {
            System.out.println("First: " + containerOneVol + "/100");
            System.out.println("Second: " + containerTwoVol + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
           
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
        
            if (command.equals("add")) {
                if (amount > 0) {
                    containerOneVol += amount;
                }
                if (containerOneVol > 100) {
                    containerOneVol = 100;
                }
            } else if (command.equals("move")) {
                if (containerOneVol >= amount) {
                    containerOneVol -= amount;
                    containerTwoVol += amount;
                } else {
                    containerTwoVol += containerOneVol;
                    containerOneVol = 0;
                }
                
                if (containerTwoVol > 100) {
                    containerTwoVol = 100;
                }
            } else if (command.equals("remove")) {
                if (containerTwoVol < amount) {
                    containerTwoVol = 0;
                } else {
                    containerTwoVol -= amount;
                }
            }
            

        }
    }

}
