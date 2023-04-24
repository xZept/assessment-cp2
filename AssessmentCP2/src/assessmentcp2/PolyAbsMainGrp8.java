package assessmentcp2;

import java.util.Scanner;

public class PolyAbsMainGrp8 {
            
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingsGrp8 obj = new SavingsGrp8(); // Object for SavingsGrp8
        System.out.println("""
                           Banking Menu
                           [1] Banking Information
                           [2] Balance Inquiry
                           [3] Withdraw
                           [4] Deposit""");
        System.out.print("Enter the number of the transaction that you want to do: ");
        int choice;
        choice = scan.nextInt();
        System.out.print("\n"); // Whitespace
        // Perform the action depending on the user's choice
        switch (choice) {
            case 1: 
                System.out.println("Account Information");
                System.out.println("Account Name: " + obj.getAccName());
                System.out.println("Account Number: " + obj.getAccNum());
                System.out.println("Address: " + obj.getAdd());
                break;
            case 2:
                obj.displayBalance();
                break;
            case 3:
                obj.withdrawAcct();
                break;
            case 4:
                obj.depositAcct();
                break;
        }          
    }  
}
