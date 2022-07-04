package chapter4Exercises;

import java.util.Scanner;

public class CreditLimitCalculator {


    public static void main(String[] args) {

        int accountNumber;
        int balanceInFirstMonth;
        int totalItemsCharge;
        int totalCredits;
        int allowedCreditLimit;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        accountNumber = input.nextInt();

        System.out.println("Enter Balance: ");
        balanceInFirstMonth = input.nextInt();

        System.out.println("Enter Total Item Charge: ");
        totalItemsCharge = input.nextInt();

        System.out.println("Enter Total Credit: ");
        totalCredits = input.nextInt();

        System.out.println("Enter Allowed Credit Limit: ");
        allowedCreditLimit = input.nextInt();


        int newBalance = balanceInFirstMonth + totalItemsCharge - totalCredits;

        System.out.println("Your new balance is: "+newBalance);

        if (newBalance > allowedCreditLimit){
            System.out.println("Credit Limit Exceeded!");
        }

    }
}
