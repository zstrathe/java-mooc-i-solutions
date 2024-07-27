
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enger password: ");
        String password = scanner.nextLine();
        
        boolean loginSuccessful = false;
        if (username.equals("alex")) {
            if (password.equals("sunshine")) {
                loginSuccessful = true;
            }
        } else if (username.equals("emma")) {
            if (password.equals("haskell")) {
                loginSuccessful = true;
            }
        }
        if (loginSuccessful) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
