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

public class Stack {
    private ArrayList<String> stackList;
    
    public Stack() {
        stackList = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.stackList.size() == 0) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        if ((!stackList.contains(value))) {
            stackList.add(value);
        }
    }
    
    public ArrayList<String> values() {
        return this.stackList;
    }
    
    public String take() {
        if (this.stackList.size() >= 1) {
            int lastPos = stackList.size()-1;
            String stackVal = this.stackList.get(lastPos);
            this.stackList.remove(lastPos);
            return stackVal;
        }
        return "";
    }
    
    
}
