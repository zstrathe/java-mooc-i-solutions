
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> intList = new ArrayList<>();
        while (true) {
            int usrInput = Integer.valueOf(scanner.nextLine());
            if (usrInput == -1) {
                break;
            }
            intList.add(usrInput);
        }
        int intSum = 0;
        for (int num: intList) {
            intSum += num;
        }
        System.out.println("Average: " + (double) intSum / intList.size());
    }
}
