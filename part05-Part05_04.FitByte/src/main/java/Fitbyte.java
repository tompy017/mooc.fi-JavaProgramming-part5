
/**
 *
 * @author tom
 */
public class Fitbyte {
    
    private int restingHR;
    private int age;
    
    // Constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHR = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHR = 206.3 - (0.711 * this.age);
        
        return (maxHR - this.restingHR) * percentageOfMaximum + this.restingHR;
    }
}
