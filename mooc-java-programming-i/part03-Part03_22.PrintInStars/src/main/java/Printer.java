
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int idx = 0;
        while (idx < array.length) {
            for (int i=0; i<array[idx]; i++) {
                System.out.print("*");
            }
            System.out.println("");
            idx += 1;
        }
    }

}
