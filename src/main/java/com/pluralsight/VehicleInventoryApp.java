package com.pluralsight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class VehicleInventoryApp {

    // create an array of Vehicles, capable of holding 20 vehicles
    public static Vehicle[] vehicleArray = new Vehicle[20];

    // create scanner for input
    public static Scanner input = new Scanner(System.in);

    // Declare a counter for current number of vehicles in the array
    public static int vehicleCount;


    public static void main(String[] args) {

        // preload 6 vehicles
        vehicleArray[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicleArray[1] = new Vehicle(101122, "Toyota Camry", "Blue",60000,11000);
        vehicleArray[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicleArray[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicleArray[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicleArray[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        while (true) {

            System.out.println("What do you want to do?\n");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit\n");
            System.out.println("Enter your command");

            int command = input.nextInt();

            // run the methods based on command input
            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    // clear buffer
                    input.nextLine();
                    findVehiclesByModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    //clear buffer
                    input.nextLine();
                    findVehiclesByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }

        }
    }

    public static int countVehicles() {
        int counter = 0;

        // for each vehicle in the vehicles array...
        for (Vehicle vehicle: vehicleArray) {
            // check if a vehicle exists
            if (vehicle != null) {
                counter++;
            }
        }

        return counter;
    }

    public static void listAllVehicles()  {

        System.out.println("vehicleId,makeModel,color,odometerReading,price");

        // loop through each Vehicle and check if its null, if not display it
        for (int i = 0; i < vehicleArray.length; i++) {
            if (vehicleArray[i] != null){
                //System.out.println("Vehicle " + (i + 1) + ": ");
                System.out.printf("%d,%s,%s,%d,%.2f\n",
                        vehicleArray[i].getVehicleId(),
                        vehicleArray[i].getMakeModel(),
                        vehicleArray[i].getColor(),
                        vehicleArray[i].getOdometerReading(),
                        vehicleArray[i].getPrice());
            }
        }

    }

    public static void findVehiclesByModel () {

        // get the make/model to search for
        System.out.println("Enter the model/make to search");
        String makeModel = input.nextLine();

        // loop through each Vehicle and check if its null, if not, check if the model matches and display
        for (int i = 0; i < vehicleArray.length; i++) {
            if (vehicleArray[i] != null) {
                if (vehicleArray[i].getMakeModel().equalsIgnoreCase(makeModel)){
                    System.out.printf("%d,%s,%s,%d,%.2f\n",
                            vehicleArray[i].getVehicleId(),
                            vehicleArray[i].getMakeModel(),
                            vehicleArray[i].getColor(),
                            vehicleArray[i].getOdometerReading(),
                            vehicleArray[i].getPrice());

                }

            }

        }

    }

    public static void findVehiclesByPrice() {

        // Get the min and max price range
        System.out.print("Enter the min price: ");
        double minPrice = input.nextDouble();

        System.out.print("Enter the max price: ");
        double maxPrice = input.nextDouble();

        System.out.println("\nVehicles in price range\n");

        // loop through each Vehicle and check if its null, if not, check if the price is in range and display
        for (int i = 0; i < vehicleArray.length; i++) {

            if (vehicleArray[i] != null) {

                if (vehicleArray[i].getPrice() <= maxPrice && vehicleArray[i].getPrice() >= minPrice) {
                    System.out.printf("%d,%s,%s,%d,%.2f\n",
                            vehicleArray[i].getVehicleId(),
                            vehicleArray[i].getMakeModel(),
                            vehicleArray[i].getColor(),
                            vehicleArray[i].getOdometerReading(),
                            vehicleArray[i].getPrice());
                }

            }

        }

    }

    public static void findVehiclesByColor() {

        // get the color to search for
        System.out.println("Enter the color to search");
        String color = input.nextLine();

        // loop through each Vehicle and check if its null, if not, check if the color matches and display
        for (int i = 0; i < vehicleArray.length; i++) {
            if (vehicleArray[i] != null) {
                if (vehicleArray[i].getColor().equalsIgnoreCase(color)){
                    System.out.printf("%d,%s,%s,%d,%.2f\n",
                            vehicleArray[i].getVehicleId(),
                            vehicleArray[i].getMakeModel(),
                            vehicleArray[i].getColor(),
                            vehicleArray[i].getOdometerReading(),
                            vehicleArray[i].getPrice());

                }

            }

        }

    }

    public static void addAVehicle() {

        // get the current vehicle count
        vehicleCount = countVehicles();

        if (vehicleCount < 20) {

            // create variables to store vehicle data
            System.out.println("Enter the vehicle id");
            long vehicleId = input.nextLong();

            // clear buffer
            input.nextLine();

            System.out.println("Enter the vehicle make/model");
            String makeModel = input.nextLine();

            System.out.println("Enter the vehicle color");
            String color = input.nextLine();

            System.out.println("Enter the vehicle odometer reading");
            long odometerReading = input.nextLong();

            System.out.println("Enter the vehicle price");
            double price = input.nextDouble();

            // create a new Vehicle object in array with the input data members
            vehicleArray[vehicleCount] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);

        }

    }

}
