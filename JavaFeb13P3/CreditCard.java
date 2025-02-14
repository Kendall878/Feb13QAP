public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;
    
    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }
    
    // Returns a copy of the balance
    public Money getBalance() {
        return new Money(balance);
    }
    
    // Returns a copy of the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    
    // Returns owner details as a string
    public String getPersonals() {
        return owner.toString();
    }
    
    // Charges the credit card if within limit
    public void charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);
        
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }
    
    // Makes a payment by subtracting amount from balance
    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}