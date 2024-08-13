
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        double cents = 5.44;
        // int newEuros = cents / 100;
        int newCents = cents % 1;
        
        System.out.println("Euros: " + newEuros + "; Cents: " + newCents);
    }
}
