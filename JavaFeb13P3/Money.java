public class Money {
    private double amount;
    
    // Constructor
    public Money(double amount) {
        this.amount = amount;
    }
    
    // Copy constructor
    public Money(Money other) {
        this.amount = other.amount;
    }
    
    // Returns the monetary amount
    public double getAmount() {
        return amount;
    }
    
    // Adds amount to current money
    public void add(Money other) {
        this.amount += other.amount;
    }
    
    // Subtracts amount from current money
    public void subtract(Money other) {
        this.amount -= other.amount;
    }
    
    // Compares two Money objects
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }
    
    // toString method to return formatted money value
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
