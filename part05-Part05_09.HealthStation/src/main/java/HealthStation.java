
public class HealthStation {
    
    private int weightCounts = 0;

    public void setWeightCounts(int weightCounts) {
        this.weightCounts = weightCounts;
    }


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        setWeightCounts(this.weightCounts + 1);
        return person.getWeight();
    }
    
    public void feed(Person person) {
        //increase weight by 1
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weightCounts;
    }
    
}
