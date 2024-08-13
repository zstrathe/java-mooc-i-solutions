import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int bookPubYear = Integer.valueOf(scanner.nextLine());
            
            bookCollection.add(new Book(bookTitle, bookPages, bookPubYear));
        }
        
        boolean printEverything = true;
        System.out.print("What information will be printed? ");
        String printOpt = scanner.nextLine();
        if (printOpt.equals("name")) {
            printEverything = false;
        }
        for (Book book: bookCollection) {
            if (printOpt.equals("name")) {
                System.out.println(book.getName());
            } else {
                System.out.println(book);
            }
        }
    }
}
