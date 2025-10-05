public class Vehicle {

    // Declare class variables; what makes this a Vehicle object
    private static long vehicleId;
    private static String makeModel;
    private static String color;
    private static int odometerReading;
    private static double price;

    /*
        Step 1
        Create a Java application called VehicleInventory. This application is intended to
        manage the inventory for a used car dealership. Users will use a menu to lookup
        vehicles or add vehicles to the list.

        Create a class named Vehicle. Add the following data members to it:
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

    public Vehicle() {

        this.vehicleId = 000000;
        this.makeModel = "N/a";
        this.color = "Nan";
        this.odometerReading = 00000;
        this.price = 99999.99;

    }

    public static long getVehicleId() {
        return vehicleId;
    }

    public static String getMakeModel() {
        return makeModel;
    }

    public static String getColor() {
        return color;
    }

    public static int getOdometerReading() {
        return odometerReading;
    }

    public static double getPrice() {
        return price;
    }



}
