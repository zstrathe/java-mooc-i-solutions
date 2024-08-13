
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countNum = 0;
        int sumNum = 0;
        while (true) {
            System.out.println("Give a number:");
            int numOpt = Integer.valueOf(scanner.nextLine());
            
            if (numOpt == 0) {
                break;
            }
            
            countNum = countNum + 1;
            sumNum = sumNum + numOpt;
        }
        
        System.out.println("Number of numbers: " + countNum);
        System.out.println("Sum of the numbers: " + sumNum);
    }
}
