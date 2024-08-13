
public class HealthStation {
    private int numWeighings;
    
    public HealthStation() {
        this.numWeighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numWeighings ++;
        return person.getWeight();
    }
    
    public int weighings() {
        return this.numWeighings;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
}
