package com.ps;


import java.io.*;
import java.nio.Buffer;

public class DealershipFileManager {


    public Dealership DealershipInformation() {



            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.txt"))) {


            // First line is dealership info, so we don't want it in the loop.
            String[] dealershipInformation = bufferedReader.readLine().split("\\|");
            String dealershipName = dealershipInformation[0];
            String dealershipAddress = dealershipInformation[1];
            String dealershipPhoneNumber = dealershipInformation[2];
            Dealership dealership = new Dealership(dealershipName, dealershipAddress, dealershipPhoneNumber);

            String input;
            while ((input = bufferedReader.readLine()) != null) {


                Vehicle vehicle = getVehicle(input);
                dealership.addVehicle(vehicle);
            }
            System.out.println("Inventory loaded");

            return dealership;
        } catch (IOException e) {
                System.out.println("Error!");
            throw new RuntimeException(e);

        }
    }

    public void saveDealership(Dealership dealership) {


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.txt"))) {

            String dealershipName = dealership.getName();
            String dealershipAddress = dealership.getAddress();
            String dealershipPhoneNumber = dealership.getPhoneNumber();


            String dealershipInformation = String.format("%s|%s|%s\n", dealershipName, dealershipAddress, dealershipPhoneNumber);
            bufferedWriter.write(dealershipInformation);


            for (Vehicle vehicle : dealership.getAllVehicles()) {
                String vehicleInformation = String.format("%d,%d,%s,%s,%s,%s,%d,%.2f\n",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getColor(),
                        vehicle.getVehicleType(),
                        vehicle.getOdometer(),
                        vehicle.getPrice());
                bufferedWriter.write(vehicleInformation);
            }
            System.out.println("Successfully saved dealership information for " + dealershipName);

        } catch (IOException e) {
            System.out.println("Failed to save dealership information: " + e.getMessage());
            throw new RuntimeException("Error writing to file", e);
        }
    }



    private Vehicle getVehicle(String input) {
        String[] vehicleInfo = input.split("\\|");
        int vin = Integer.parseInt(vehicleInfo[0]);
        int year = Integer.parseInt(vehicleInfo[1]);
        String make = vehicleInfo[2];
        String model = vehicleInfo[3];
        String vehicleType = vehicleInfo[4];
        String color = vehicleInfo[5];
        int odometer = Integer.parseInt(vehicleInfo[6]);
        double price = Double.parseDouble(vehicleInfo[7]);

        //Creating a vehicle and adding the vehicle to the dealership inventory
        return new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
    }


}