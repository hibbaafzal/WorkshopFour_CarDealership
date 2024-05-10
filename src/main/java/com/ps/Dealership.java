package com.ps;


import java.util.ArrayList;
import java.util.List;



public class Dealership {

    String name;
    String address;
    String phoneNumber;

    static ArrayList<Vehicle> carInventory = new ArrayList<>();

    public Dealership() {

    }


    // holds information about the dealership
    // name
    // address

    // Constructors
    Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.carInventory = new ArrayList<>(); // instantiating arraylist in constructor
    }

    //Methods


    //Getters and Setters


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getAllVehicles() {
        return this.carInventory;
    }


// maintain list of vehicles


// methods to search list for matching vehicles

// add/ remove vehicles


    public static ArrayList<Vehicle> filterByPrice(double minimumPrice, double maximumPrice) {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        if (carInventory.isEmpty()) {
            return filteredVehicles; // Return empty list if no vehicles available
        }

        for (Vehicle vehicle : carInventory) {
            double price = vehicle.getPrice();
            if (price >= minimumPrice && price <= maximumPrice) {
                filteredVehicles.add(vehicle);
            }
        }

        return filteredVehicles;
    }

    public static ArrayList<Vehicle> filterByMakeAndModel(String make, String model) {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : carInventory) {
            if (vehicle.getMake().toLowerCase().contains(make.toLowerCase()) &&
                    vehicle.getModel().toLowerCase().contains(model.toLowerCase())) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public static ArrayList<Vehicle> filterByYear(int year) {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : carInventory) {
            int yearProvided = vehicle.getYear();
            if (year == yearProvided) {
                filteredVehicles.add(vehicle);
            } else {
                System.out.println("Sorry, there are no vehicles matching your search");
            }
        }
        return filteredVehicles;
    }


    public static ArrayList<Vehicle> filterByColor(String color) {

        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : carInventory) {
            if (vehicle.getColor().toLowerCase().contains(color.toLowerCase())) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }



        public static ArrayList<Vehicle> filterByMileage(int minMileage, int maxMileage) {
            ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

            for (Vehicle vehicle : carInventory) {
                if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                    filteredVehicles.add(vehicle);
                }
            }

            if (filteredVehicles.isEmpty()) {
                System.out.println("No vehicles found within the specified mileage range.");
                return null;

            } else {
                return filteredVehicles;
            }


        }


    public static ArrayList<Vehicle> filterByType(String type) {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle vehicle : carInventory) {
            if (vehicle.getVehicleType().toLowerCase().contains(type.toLowerCase())) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }




    public static void allVehicles() {
        if (carInventory.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : carInventory) {
            System.out.println(vehicle);
        }
    }



    public static void addVehicle(Vehicle vehicle) {
        carInventory.add(vehicle);
    }


    public static void removeVehicle(Vehicle vehicle) {
        carInventory.remove(vehicle);
    }
}



