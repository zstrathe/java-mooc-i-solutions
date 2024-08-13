
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int numOpt = Integer.valueOf(scanner.nextLine());
            
            if (numOpt == 0) {
                break;
            } else if (numOpt < 0) {
                negCount = negCount + 1;
            }
        }
        System.out.println("Number of negative numbers: " + negCount);
    }
}
