
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int posCount = 0;
        int posSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int numOpt = Integer.valueOf(scanner.nextLine());
            
            if (numOpt == 0) {
                break;
            } 
            
            if (numOpt > 0) {
                posCount = posCount + 1;
                posSum = posSum + numOpt;
            } 
            
        }
        if (posCount > 0) {
            System.out.println((double) posSum / posCount);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
