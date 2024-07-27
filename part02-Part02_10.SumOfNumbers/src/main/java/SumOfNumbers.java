
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNum = 0;
        while (true) {
            System.out.println("Give a number:");
            int numOpt = Integer.valueOf(scanner.nextLine());
            
            if (numOpt == 0) {
                break;
            }
            
            sumNum = sumNum + numOpt;
        }
        System.out.println("Sum of the numbers: " + sumNum);
    }
}
