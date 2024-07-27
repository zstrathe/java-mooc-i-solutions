
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
           // System.out.print("Enter a string (input nothing to quit): ");
            String usrString = scanner.nextLine();
            
            if (usrString.equals("")) {
                break;
            } else {
                for (String word: usrString.split(" ")) {
                    System.out.println(word);
                }
            }
        }

    }
}
