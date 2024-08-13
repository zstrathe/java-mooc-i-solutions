
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> intList = new ArrayList<>();
        while (true) {
            int usrInput = Integer.valueOf(scanner.nextLine());
            
            if (usrInput == 9999) {
                break;
            }
            intList.add(usrInput);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNum = 9999999;
        for (int i = 0; i < intList.size(); i++) {
            int tmpNum = intList.get(i);
            if (tmpNum < smallestNum) {
                smallestNum = tmpNum;
            }
        }
        System.out.println("Smallest number: " + smallestNum);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == smallestNum) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
