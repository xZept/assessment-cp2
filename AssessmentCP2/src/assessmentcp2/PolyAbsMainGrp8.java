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
                           [4] Deposit
                           [5] Exit""");
        System.out.print("Enter the number of the transaction that you want to do: ");
        int choice = scan.nextInt();
        System.out.print("\n"); // Whitespace
        // Perform the action depending on the user's choice
        switch (choice) {
            case 1: 
                obj.displayInfo();
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
            case 5:
                System.out.println("Thank you for using our service!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }      
    }  
}
