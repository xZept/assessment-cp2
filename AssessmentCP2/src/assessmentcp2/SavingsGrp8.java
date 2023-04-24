package assessmentcp2;

import java.util.Scanner;

public class SavingsGrp8 extends AccountGrp8 {

    public SavingsGrp8() {
        super();
    }

    Scanner amount = new Scanner(System.in);
    private int accountNumber = 1234;
    private double initialAmount = 3000.0;
    private String accountName = "Shaan Masangcap", address = "Balanga City";
    public double currentAmount = initialAmount;

    public double updateBalance() {
        double balance = initialAmount;
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + initialAmount);
    }

    public void displayBalance(String accountName, double currentAmount) {
        System.out.println("\nAccount Name: "+accountName);
        System.out.println("Current Balance: "+currentAmount);
    }

    @Override
    public double withdrawAcct() {
        displayBalance(accountName, currentAmount);
        int withdrawAmount = 0;

        while (withdrawAmount % 100 == 0) {
            withdrawAmount = amount.nextInt();
            if (withdrawAmount % 100 != 0) {
                System.out.println("Please enter amount in multiples of 100.");
            }
        }
        currentAmount = initialAmount - withdrawAmount;
        return currentAmount;
    }

    @Override
    public double depositAcct() {
        displayBalance(accountName, currentAmount);
        int depositAmount = 0;

        while (depositAmount % 100 == 0) {
            depositAmount = amount.nextInt();
            if (depositAmount % 100 != 0) {
                System.out.println("Please enter amount in multiples of 100.");
            }
        }
        currentAmount = initialAmount + depositAmount;
        return currentAmount;
    }

    public int getAccNum() {
        return accountNumber;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public String getAccName() {
        return accountName;
    }

    public String getAdd() {
        return address;
    }

}
