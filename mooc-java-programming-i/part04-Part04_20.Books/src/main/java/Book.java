/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
public class Book {
    private String title;
    private int pagesCount;
    private int pubYear;
    
    public Book(String title, int pagesCount, int pubYear) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.pubYear = pubYear;
    }
    
    public String toString() {
        return this.title + ", " + this.pagesCount + " pages, " + this.pubYear;
    }
    
    public String getName() {
        return this.title;
    }
    
}
