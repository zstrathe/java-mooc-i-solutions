
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        return smallestFrom(array, 0, "value");
    }
    
    public static int indexOfSmallest(int[] array) {
        return smallestFrom(array, 0, "index");
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        return smallestFrom(array, startIndex, "index");
    }
    
    public static int smallestFrom(int[] table, int startIndex, String outOption) {
        int smallest = table[startIndex];
        int smallestIdx = startIndex;
        for (int i=startIndex+1; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIdx = i;
            }
        }
        if (outOption.equals("index")) {
            return smallestIdx;
        } else if (outOption.equals("value")) {
            return smallest;
        }
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmpVal = array[index1];
        array[index1] = array[index2];
        array[index2] = tmpVal;
    }
    
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length -1 ) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    
    public static void sort(int[] array) {
        print(array);
        swap(array, 0, indexOfSmallest(array));
        int sortIdx = 1;
        while (sortIdx < array.length) {
            swap(array, sortIdx, indexOfSmallestFrom(array, sortIdx));
            print(array);
            sortIdx ++;
        }
        
    }

}
