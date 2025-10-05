package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {

    public static void main(String[] args) {

        // create scanner for input
        Scanner input = new Scanner(System.in);

        // create an array of Vehicles, capable of holding 20 vehicles
        Vehicle[] vehicles = new Vehicle[20];

        // create a counter for current number of vehicles in the array
        int vehicleCount;

        boolean quitting = false;

        while (!quitting) {

            System.out.println("What do you want to do?\n");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit\n");
            System.out.println("Enter your command");

        }
    }

    public static int countVehicle (Vehicle[] v, int counter) {

        // for each vehicle in the vehicles array...
        for (Vehicle vehicle: v) {
            // check if a vehicle exists
            if (vehicle != null) {
                counter++;
            }
        }

        return counter;
    }

}
