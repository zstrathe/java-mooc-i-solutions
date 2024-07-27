
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int stringCount = 0;
        while (true) {
            String inputString = scanner.nextLine();
            
            if (inputString.equals("end")) {
                break;
            }
            stringCount ++;
        }
        
        System.out.println(stringCount);
    }
}
