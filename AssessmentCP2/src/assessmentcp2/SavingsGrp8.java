package assessmentcp2;

import java.util.Scanner; 

public class SavingsGrp8 extends AccountGrp8 {

    Scanner scan = new Scanner(System.in);
    private double balance, amount;

    // Getter for initial amount
    public double getInitialAmount() {
        return balance;
    }
    
    // Calls the constructor from the parent class then calls a method to update the balance
    public SavingsGrp8() {
        super();
        updateBalance();
    }
    
    // Assigns a initial amount to the variable balance
    private void updateBalance(){
        balance += 3000.0;
    }
    
    // Display the account details
    public void displayInfo() {
        System.out.println("Account Information");
        System.out.println("Account Name: " + getAccName());
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Address: " + getAdd());
    }
    // Displays the balance for the balance inquiry
    public void displayBalance(){
        System.out.println("Balance Inquiry Transaction");
        System.out.println("The current Balance is " + balance + ".");
    }
    
    // Displays the balance for withdrawal/deposit transactions
    public void displayBalance(String name, double balance) {
        System.out.println("Hello " + super.getAccName() + "!");
        System.out.println("Your current balance in your savings account is " + balance + ".");
    }
    
    // Bodies of the abstract methods from AccountGrp8
    public void withdrawAcct() {
        System.out.println("Withdrawal Transaction");
        System.out.print("Enter amount to be withdrawn: ");
        amount = scan.nextInt();
        if (checkAmount(amount, balance)) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds.");
        }  
        displayBalance(super.getAccName(),balance);
    }
    
    public void depositAcct() {
        System.out.println("Deposit Transaction");
        System.out.print("Enter amount to be deposited: ");
        amount = scan.nextInt();
        balance += amount;
        displayBalance(super.getAccName(),balance);
    }
    
    // Checks if the amount is within the balance
    public boolean checkAmount(double amount, double balance) {
        return amount <= balance;
    }
}
