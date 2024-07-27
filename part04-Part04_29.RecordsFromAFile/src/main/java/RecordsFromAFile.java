
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of file:");
        String fileName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] lineSplit = line.split(",");
                String name = lineSplit[0];
                int age = Integer.valueOf(lineSplit[1]);
                System.out.print(name + ", age: " + age + " year");
                if (age != 1) {
                    System.out.print("s");
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
