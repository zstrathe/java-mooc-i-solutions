
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumBirthYears = 0;
        String longestNameStr = "";
        int longestNameLength = 0;
        while (true) {
            String usrInput = scanner.nextLine();
            if (usrInput.equals("")) {
                break;
            }
            
            String[] split = usrInput.split(",");
            String name = split[0];
            int birthYear = Integer.valueOf(split[1]);
            
            // add birthYear to sumBirthYears, and increase the count
            sumBirthYears += birthYear;
            count ++;
            
            if (name.length() > longestNameLength) {
                longestNameStr = name;
                longestNameLength = name.length();
            }
        }
        
        System.out.println("Longest name: " + longestNameStr);
        System.out.println("Average of the birth years: " + (double) sumBirthYears/count);
    }
}
