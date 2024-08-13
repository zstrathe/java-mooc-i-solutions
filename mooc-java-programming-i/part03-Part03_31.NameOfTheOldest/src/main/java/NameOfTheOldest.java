
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldestPerson = "";
        int oldestAge = 0;
        while (true) {
            String usrInput = scanner.nextLine();
            if (usrInput.equals("")) {
                break;
            }
            
            String[] inputSplit = usrInput.split(",");
            String name = inputSplit[0];
            int age = Integer.valueOf(inputSplit[1]);
            
            if (age > oldestAge) {
                oldestPerson = name;
                oldestAge = age;
            }
            
        }
        
        System.out.println("Name of the oldest: " + oldestPerson);

    }
}
