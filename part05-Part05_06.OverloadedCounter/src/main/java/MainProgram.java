
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);
        
        System.out.println("Start: counter1 = 0; counter2 = 10");
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        System.out.println();
        
        counter1.increase();
        counter2.decrease(5);
        System.out.println("counter1 +1; counter2 -5");
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        System.out.println();
        
        counter1.increase(100);
        counter2.decrease();
        System.out.println("counter1 + 100; counter2 - 1");
        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }
}
