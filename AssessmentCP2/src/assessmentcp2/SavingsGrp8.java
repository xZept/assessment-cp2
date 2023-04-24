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
    public void updateBalance(){
        balance += 3000.0;
    }
    
    // Displays the balance for the balance inquiry
    public void displayBalance(){
        System.out.println("Balance Inquiry Transaction");
        System.out.println("The current Balance is " + balance +" \n");
    }
    
    // Displays the balance for withdrawal/deposit transactions
    public void displayBalance(String name, double balance) {
        System.out.println("Hello " + super.getAccName());
        System.out.println("Your current balance in your savings account is " + balance);
    }
    
    // Bodies of the abstract methods from AccountGrp8
    @Override
    public void withdrawAcct() {
        System.out.println("Withdrawal Transaction");
        System.out.print("Enter amount to be withdrawn: ");
        amount = scan.nextInt();
        if (checkAmount(amount, balance) == true) {
            balance -= amount;
            System.out.println("Hello " + super.getAccName() + "!");
        }
        else {
            System.out.println("Insufficient funds.");
        }  
        System.out.println("Your current balance in your savings account is " + balance + ".");
    }
    
    @Override
    public void depositAcct() {
        System.out.println("Deposit Transaction");
        System.out.print("Enter amount to be deposited: ");
        amount = scan.nextInt();
        balance += amount;
        System.out.println("Hello " + super.getAccName() + "!");
        System.out.println("Your current balance in your savings account is " + balance + ".");
    }
    
    // Checks if the amount is within the balance
    public boolean checkAmount(double amount, double balance) {
        return amount <= balance;
    }
}
