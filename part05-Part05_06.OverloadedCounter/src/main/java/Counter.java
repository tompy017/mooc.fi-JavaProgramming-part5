
/**
 *
 * @author tom
 */
public class Counter {
    
    private int value;
    
    //Constructors
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    
    //Methods
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void increase(int number) {
        if (number > 0) {
            this.value += number;
        }    
    }
    
    public void decrease(int number) {
        if (number > 0) {
            this.value -= number;
        }
    }    
}
