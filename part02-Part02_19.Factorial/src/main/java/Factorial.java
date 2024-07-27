
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int numOpt = Integer.valueOf(scanner.nextLine());
        
        int numFact = 1;
        
        for (int i = 1; i <= numOpt; i++) {
            numFact *= i;
        }
        
        System.out.println("Factorial: " + numFact);
    }
}
