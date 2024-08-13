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

public class Room {
    private ArrayList<Person> rmList;
    
    public Room() {
        this.rmList = new ArrayList<>();
    }
    
    public void add(Person person) {
        if (!(this.rmList.contains(person))) {
            this.rmList.add(person);
        }
    }
    
    public boolean isEmpty() {
        if (this.rmList.size() == 0) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.rmList;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        Person outPerson = rmList.get(0);
        for (Person p: rmList) {
            if (p.getHeight() < outPerson.getHeight()) {
                outPerson = p;
            }
        }
        return outPerson;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        rmList.remove(shortest);
        return shortest;
    }
}
