package com.pluralsight;

public class Vehicle {

    // Declare class variables; what makes this a com.pluralsight.Vehicle object
    private long vehicleId;
    private String makeModel;
    private String color;
    private long odometerReading;
    private double price;

    /*
        Step 1
        Create a Java application called VehicleInventory. This application is intended to
        manage the inventory for a used car dealership. Users will use a menu to lookup
        vehicles or add vehicles to the list.

        Create a class named com.pluralsight.Vehicle. Add the following data members to it:
            vehicleId - a long (ex: 101121)
            makeModel - a string (ex: Ford Explorer)
            color - a string (ex: Red)
            odometerReading - an int (ex: 32775)
            price - a float (ex: 12250.00) (no Lamborghinis here!)
        Add a constructor and get/set methods for each property of the car.
        Back in main(), create an array capable of holding up to 20 vehicles and a
        counter variable that tells you how many vehicles are in the array right now.

        Preload the array with 6 vehicles:
            vehicleId,makeModel,color,odometerReading,price
            101121,Ford Explorer,Red,45000,13500
            101122,Toyota Camry,Blue,60000,11000
            101123,Chevrolet Malibu,Black,50000,9700
            101124,Honda Civic,White,70000,7500
            101125,Subaru Outback,Green,55000,14500
            101126,Jeep Wrangler,Yellow,30000,16000
        Create a loop and prompt the user for a command within the loop. The code the
        user sees should be:
            What do you want to do?
            1 - List all vehicles
            2 - Search by make/model
            3 - Search by price range
            4 - Search by color
            5 - Add a vehicle
            6 - Quit
            Enter your command
     */

    public Vehicle(long vehicleId, String makeModel, String color, long odometerReading, double price) {

        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }

    // getter methods, returns the data members of the com.pluralsight.Vehicle object it is used on
    public long getVehicleId() {
        return vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public String getColor() {
        return color;
    }

    public long getOdometerReading() {
        return odometerReading;
    }

    public double getPrice() {
        return price;
    }

    // setter methods, accepts a vehicle object and updates the data members
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
