
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());

        double taxVal = 0;

        if (gift >= 1000000) {
            taxVal = 142100 + ((gift - 1000000) * 0.17);
        } else if (gift >= 200000) {
            taxVal = 22100 + ((gift - 200000) * 0.15);
        } else if (gift >= 55000) {
            taxVal = 4700 + ((gift - 55000) * 0.12);
        } else if (gift >= 25000) {
            taxVal = 1700 + ((gift - 25000) * 0.10);
        } else if (gift >= 5000) {
            taxVal = 100 + ((gift - 5000) * 0.08);
        }

        if (taxVal > 0) {
            System.out.println("Tax: " + taxVal);
        } else {
            System.out.println("No tax!");
        }
    }
}
