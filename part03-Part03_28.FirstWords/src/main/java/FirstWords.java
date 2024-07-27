
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String usrInput = scanner.nextLine();
            if (usrInput.equals("")) {
                break;
            }
            
            String[] splitWords = usrInput.split(" ");
            System.out.println(splitWords[0]);
        }
    }
}
