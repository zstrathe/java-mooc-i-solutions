
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string_value = scan.nextLine();
        
        System.out.println("Give an integer:");
        int int_value = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double double_value = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool_value = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string_value);
        System.out.println("You gave the integer " + int_value);
        System.out.println("You gave the double " + double_value);
        System.out.println("You gave the boolean " + bool_value);
    }
}
