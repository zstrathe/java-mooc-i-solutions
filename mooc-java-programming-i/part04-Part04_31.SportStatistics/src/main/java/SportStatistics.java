
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            int gameCount = 0;
            int wins = 0;
            int losses = 0;
            
            while (fileScanner.hasNextLine()) {
            
                String line = fileScanner.nextLine();
                String[] splitLines = line.split(",");
                String homeTeam = splitLines[0];
                String awayTeam = splitLines[1];
                int homePoints = Integer.valueOf(splitLines[2]);
                int awayPoints = Integer.valueOf(splitLines[3]);


                if (homeTeam.equals(teamName) || awayTeam.equals(teamName)) {
                    gameCount ++;
                    
                    if (homeTeam.equals(teamName)) {
                        if (homePoints > awayPoints) {
                            wins ++;
                        } else {
                            losses ++;
                        }
                    }
                
                    if (awayTeam.equals(teamName)) {
                        if (awayPoints > homePoints) {
                            wins ++;
                        } else {
                            losses ++;
                        }
                    }
                }
            }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }

}
