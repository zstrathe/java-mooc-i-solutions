/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
import java.util.ArrayList;

public class IntegerContainer {
    private ArrayList<Integer> failList;
    private ArrayList<Integer> passList;

    public IntegerContainer() {
        this.passList = new ArrayList<>();
        this.failList = new ArrayList<>();
    }
    
    public void add(int input) {
        if (input >= 0 && input <= 100) {
            if (input >= 50) {
                this.passList.add(input);
            } else {
                this.failList.add(input);
            }
            
        }
    }
    
    public double getAverage() {
        int total = 0;
        for (int num: this.passList) {
            total += num;
        }
        for (int num: this.failList) {
            total += num;
        }
        return 1.0 * total / (this.passList.size() + this.failList.size());
    }
    
    public double getAveragePassing() {
        int total = 0;
        for (int num: this.passList) {
            total += num;
        }
        
        return 1.0 * total / this.passList.size();
    }
    
    public double getPercentagePassing() {
        return (1.0 * this.passList.size() / (this.passList.size() + this.failList.size())) * 100;
    }
    
    
    public void printGradeDistribution() {
        int[] gradesDist = {this.failList.size(), 0, 0, 0, 0, 0};
        for (int num: this.passList) {
            if (num >= 90) {
                gradesDist[5] ++;
            } else if (num >= 80) {
                gradesDist[4] ++;
            } else if (num >= 70) {
                gradesDist[3] ++;
            } else if (num >= 60) {
                gradesDist[2] ++;
            } else if (num >= 50) {
                gradesDist[1] ++;
            }
        }
        for (int i = gradesDist.length -1; i >= 0; i--) {
            System.out.print(i + ": ");
            int numStars = gradesDist[i];
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

