/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */
public class ArchiveItem {
    private String name;
    private String identifier;
    
    public ArchiveItem(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        
        if (!(other instanceof ArchiveItem)) {
            return false;
        }
        
        ArchiveItem otherArchive = (ArchiveItem) other;
        if (this.identifier.equals(otherArchive.identifier)) {
            return true;
        }
        return false;
    }
}
