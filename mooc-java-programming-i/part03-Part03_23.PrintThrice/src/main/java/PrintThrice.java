
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give string: ");
        String inStr = scanner.nextLine();
        System.out.println(inStr + inStr + inStr);
    }
}
