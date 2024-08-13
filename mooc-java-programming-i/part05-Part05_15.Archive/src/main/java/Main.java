
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArchiveItem> archiveList = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            ArchiveItem item = new ArchiveItem(identifier, name);
            if (!(archiveList.contains(item))) {
                archiveList.add(item);
            } else {
                System.out.println("Item already added to list!");
            } 
        }
        System.out.println("==Items==");
        for (ArchiveItem item: archiveList) {
            System.out.println(item);
        }
        
    }
}
