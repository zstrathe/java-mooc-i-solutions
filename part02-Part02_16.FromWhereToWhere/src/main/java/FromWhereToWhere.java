
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int numToOpt = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int numFromOpt = Integer.valueOf(scanner.nextLine());
        for (int i = numFromOpt; i <= numToOpt; i++) {
            System.out.println(i);
        }
    }
}
