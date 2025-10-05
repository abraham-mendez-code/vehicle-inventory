package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {

    // create an array of Vehicles, capable of holding 20 vehicles
    public static Vehicle[] vehicleArray = new Vehicle[20];

    // create scanner for input
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // create a counter for current number of vehicles in the array
        int vehicleCount;

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

            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    //findVehiclesByPrice();
                    break;
                case 5:
                    //addAVehicle();
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

        //int counter = countVehicles();
        System.out.println("vehicleId,makeModel,color,odometerReading,price");

        for (int i = 0; i < vehicleArray.length; i++) {
            if (vehicleArray[i] != null){
                System.out.println("Vehicle " + (i + 1) + ": ");
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
