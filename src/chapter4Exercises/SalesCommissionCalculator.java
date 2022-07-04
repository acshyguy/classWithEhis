package chapter4Exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double weeklyIncome = 200;

        System.out.println("Enter number of item1 sold: ");
        double item1 = input.nextDouble();


        System.out.println("Enter number of item2 sold: ");
        double item2 = input.nextDouble();

        System.out.println("Enter number of item3 sold: ");
        double item3 = input.nextDouble();

        System.out.println("Enter number of item4 sold: ");
        double item4 = input.nextDouble();

        double grossSales = (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89);

        double commission = grossSales * 0.09;

        double earnings = weeklyIncome + commission;

        System.out.printf("Total Earnings is: %.2f ", earnings);
    }

}
