
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String usrIn = scanner.nextLine();
            if (usrIn.equals("")) {
                break;
            }
            
            for (String word: usrIn.split(" ")) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
