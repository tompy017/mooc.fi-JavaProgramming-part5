
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    /*
    private double affordableCost = 2.50;
    private double heartyCost = 4.30;
    */
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3; 
    

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }
    
    //CASH PAYMENTS
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        //double affordableCost = 2.50;
        
        if (payment >= PaymentTerminal.AFFORDABLE_PRICE) {
            this.affordableMeals ++;
            // increase the amount of cash by the price of an affordable mean and return the change
            this.money += PaymentTerminal.AFFORDABLE_PRICE;
            return payment - PaymentTerminal.AFFORDABLE_PRICE;
        }    
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        //double heartyCost = 4.30;
        // increase the amount of cash by the price of a hearty mean and return the change
        if (payment >= PaymentTerminal.HEARTY_PRICE) {
            this.heartyMeals ++;
            this.money += PaymentTerminal.HEARTY_PRICE;
            return payment - PaymentTerminal.HEARTY_PRICE;  
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }
    
    
    // CARD PAYMENTS
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= PaymentTerminal.AFFORDABLE_PRICE){
            this.affordableMeals ++;
            card.takeMoney(PaymentTerminal.AFFORDABLE_PRICE);
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= PaymentTerminal.HEARTY_PRICE) {
            this.heartyMeals ++;
            card.takeMoney(PaymentTerminal.HEARTY_PRICE);
            return true;
        }
        return false;
    }
    
    
    //ADDING MONEY TO THE CARD AND REFLECTING IT ON THE REGISTER(cash payment to add funds on card)
    public void addMoneyToCard(PaymentCard card, double amount) {
        if (amount > 0) {
            card.addMoney(amount);
            this.setMoney(this.money += amount);
        }
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
