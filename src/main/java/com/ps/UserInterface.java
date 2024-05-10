package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {


    static Scanner scanner = new Scanner(System.in);
    static Dealership dealership = new Dealership();

    public static void display() {
        init();
    }

    public static void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();


        System.out.println("\n\n---------Welcome to our Dealership!!---------");
        int mainMenuCommand;

        do {
            System.out.println("What would you like to do?");
            System.out.println("\t1. Find vehicles within a price range.");
            System.out.println("\t2. Find vehicles by make and model");
            System.out.println("\t3. Find vehicles by year.");
            System.out.println("\t4. Find vehicles by color.");
            System.out.println("\t5. Find vehicles by mileage range.");
            System.out.println("\t6. Find vehicles by car type.");
            System.out.println("\t7. List ALL vehicles.");
            System.out.println("\t8. Add a vehicle.");
            System.out.println("\t9. Remove a vehicle.");
            System.out.println("\t99. Quit.");

            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    // price range
                    System.out.println("Enter minimum price:");
                    double minPrice = scanner.nextDouble();
                    System.out.println("Enter maximum price:");
                    double maxPrice = scanner.nextDouble();

                    Dealership.filterByPrice(minPrice, maxPrice);


                    break;

                case 2:

                    System.out.println filterByMakeAndModel ("Enter make and model: ");
                    String makeAndModel = scanner.nextLine();
                    scanner.nextLine();

                    break;


                case 3:
                    // by year

                    System.out.println("Enter year:");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Dealership.filterByYear(year);

                    break;

                case 4:
                    // by color
                    System.out.println("Enter color:");
                    String color = scanner.nextLine();
                    scanner.nextLine();
                    Dealership.filterByColor(color);
                    break;
                case 5:

//                    // by mileage range

                    System.out.println("Enter minimum mileage:");
                    int minMileage = scanner.nextInt();
                    System.out.println("Enter maximum mileage:");
                    int maxMileage = scanner.nextInt();

                    Dealership.filterByMileage(minMileage, maxMileage);
                    //   DealershipFileManager.searchByMileageRange(minMileage, maxMileage);
                    break;

                case 6:
                    // by car type
                    System.out.println("Enter car type:");
                    String type = scanner.nextLine();
                    scanner.nextLine();


                    Dealership.filterByType(type);
                    //  DealershipFileManager.searchByCarType(type);

                    break;

                case 7:
                    // ALL vehicles

                    Dealership.allVehicles();


                    break;

                case 8:
                    // Add a vehicle

                    Dealership.addVehicle(Vehicle vehicle);

                    break;
                case 9:
                    // Remove a vehicle

                    //  DealershipFileManager.removeVehicle(int vin);
                    Dealership.removeVehicle(Vehicle vehicle);

                    break;
                case 99:
                    // Quit
                    System.out.println("Thank you for visiting!");
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid command.");
            }


        } while (mainMenuCommand != 99);
    }
}

