/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
public class Multiplier {
    private int numberOpt;
    
    public Multiplier(int number) {
        this.numberOpt = number;
    }
    
    public int multiply(int number) {
        return this.numberOpt * number;
    }
}
