
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i<=size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height-i);
            printStars(i+(i-1));
        }
        int lastLineLength = (height * 2) - 1;
        int boxSpacing = (lastLineLength - 3)/2;
        for (int i=0; i<2; i++) {
            printSpaces(boxSpacing);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
