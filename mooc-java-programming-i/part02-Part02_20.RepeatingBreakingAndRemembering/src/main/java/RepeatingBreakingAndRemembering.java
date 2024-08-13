
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int numSum = 0;
        int numCount = 0;
        int eCount = 0;
        int oCount = 0;
          
        System.out.println("Give numbers:");
        while (true) {
            int numOpt = Integer.valueOf(scanner.nextLine());
            if (numOpt == -1) {
                break;
            }
            
            if (numOpt % 2 == 0) {
                eCount ++;
            } else {
                oCount ++;
            }
            numSum += numOpt;
            numCount ++;
            
                   
        }
        System.out.println("Thx! Bye!");   
        System.out.println("Sum: " + numSum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + ((double) numSum / numCount));
        System.out.println("Even: " + eCount);
        System.out.println("Odd: " + oCount);
    }
}
