
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.print("Swap index 1? ");
        int ind1 = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Swap index 2? ");
        int ind2 = Integer.valueOf(scanner.nextLine());
        
        int tmpSwapVal = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmpSwapVal;
        
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
