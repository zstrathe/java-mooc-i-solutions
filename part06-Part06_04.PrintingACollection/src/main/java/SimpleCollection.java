
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        String outItems = "";
        for (int i=0; i < this.elements.size(); i++) {
            outItems = outItems + this.elements.get(i);
            if (i < this.elements.size()-1) {
                outItems += "\n";
            }
        }
        String outStr = "The collection " + this.name + " has " + this.elements.size() + " element";
        if (this.elements.size() > 1) {
            outStr += "s:\n";
        } else {
            outStr += ":\n";
        }
        outStr += outItems;
        return outStr;
    }
    
}
