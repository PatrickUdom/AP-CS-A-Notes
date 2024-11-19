// Question: Write a program that models investments and investors. Create classes for Investment and Investor. The Investment class should have properties for the amount and the interest rate. The Investor class should have properties for the name and an array of investments. Implement methods to add investments and calculate the total value of an investor's investments.
// Example: 
// Investor: John Doe
// Investments: 
// - Amount: 1000, Interest Rate: 0.05, Value: 1050.0
// - Amount: 2000, Interest Rate: 0.03, Value: 2060.0
// Total value of investments: 3110.0

class Investment {
    private double amount;
    private double interestRate;

    public Investment(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateValue() {
        return amount + (amount * interestRate);
    }
}

class Investor {
    private String name;
    private Investment[] investments;
    private int investmentCount;

    public Investor(String name, int maxInvestments) {
        this.name = name;
        this.investments = new Investment[maxInvestments];
        this.investmentCount = 0;
    }

    public void addInvestment(Investment investment) {
        if (investmentCount < investments.length) {
            investments[investmentCount++] = investment;
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (int i = 0; i < investmentCount; i++) {
            totalValue += investments[i].calculateValue();
        }
        return totalValue;
    }

    public String getName() {
        return name;
    }
}

public class L5InvestmentsAndInvestors {
    public static void main(String[] args) {
        Investor investor = new Investor("John Doe", 10);
        investor.addInvestment(new Investment(1000, 0.05));
        investor.addInvestment(new Investment(2000, 0.03));

        System.out.println("Total value of investments for " + investor.getName() + ": " + investor.calculateTotalValue());
    }
}