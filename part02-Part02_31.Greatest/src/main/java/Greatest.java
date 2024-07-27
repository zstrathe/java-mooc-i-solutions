
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int largestNum = number1;
        if (number2 > largestNum) {
            largestNum = number2;
        } 
        
        if (number3 > largestNum) {
            largestNum = number3;
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int result = greatest(7, 7, 2);
        System.out.println("Greatest: " + result);
    }
}
