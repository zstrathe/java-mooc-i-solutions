
import java.util.Scanner;

public class AverageOfNumbers {

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
        System.out.println("Average of the numbers: " + ((double) sumNum / countNum));
    }
}
