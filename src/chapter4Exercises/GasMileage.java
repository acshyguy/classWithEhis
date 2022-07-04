package chapter4Exercises;

import java.util.Scanner;

public class GasMileage {
    private static int miles;
    private static int gallons;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int trip = 0;
        int totalMiles = 0;
        int totalGallons =0;
        double milesPerGallon = 0.0;
        double totalMilesPerGallon = 0.0;

        System.out.println("Enter miles driven or press -1 to exit: ");
        miles = input.nextInt();


        if (miles != -1) {
            System.out.println("Enter gallons used for each trip: ");
             gallons = input.nextInt();
            trip++;
        }

        while (miles != -1){
            totalMiles += miles;

            totalGallons += gallons;

            milesPerGallon = (double) miles / gallons;

            totalMilesPerGallon = (double) totalMiles / totalGallons;

            System.out.printf("trip %d's miles per gallon is: %.2f%n%n", trip, milesPerGallon);

            if (trip > 1){
                System.out.printf("Total miles for your %d trip is: %d%n", trip, totalMiles);
                System.out.printf("Total gallons for your %d trip is: %d%n", trip, totalGallons);
                System.out.printf("Total miles per gallons for your %d trip is: %.2f%n", trip, totalMilesPerGallon);
            }

            trip++;

            System.out.printf("Enter trip %d mileage or -1 to exit ", trip);
            miles = input.nextInt();
            if (miles != -1){
                System.out.printf("Enter trip %d gallons: ", trip);
                gallons = input.nextInt();
            }

        }
        if (totalMiles != 0) {
            System.out.println("Total Trips: "+(trip - 1));
            System.out.println("Total Miles: "+totalMiles);
            System.out.println("Total Gallons: "+totalGallons);
            System.out.printf("Total Miles per Gallon: %.2f", totalMilesPerGallon);
        }
        else{
            System.out.println("No Trip Information was entered!");
        }

    }

}
