# Car Dealership
The goal of this application is to allow users to search for a vehicle as well as add and remove a vehicle from the inventory.

### Home Page
When the user first starts the application they are shown a menu from which they can choose a variety of options. They can filter the inventory and search for a specific vehicle or view all vehicles or remove or add a vehicle.

<img width="403" alt="Screenshot 2024-05-10 at 3 14 10 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/491e69c0-7fc5-4dc1-b267-3ba22f62dddd">

## Filters

### By Price

If the user wishes to search for a vehicle by price, they can enter the minimum and maximum price and filter results. 

<img width="439" alt="Screenshot 2024-05-10 at 3 14 36 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/04c35fd2-ae33-41ad-94c7-65e1ca433eba">

### By Year

If the user wishes to search for a vehicle by year, they can enter the year and filter results. 

<img width="477" alt="Screenshot 2024-05-10 at 6 04 30 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/b8801dfb-7982-4a1e-9966-d9280443e3cd">

### By Mileage

If the user wishes to search for a vehicle by mileage, they can enter the minimum and maximum mileage and filter results. 

<img width="471" alt="Screenshot 2024-05-10 at 6 06 24 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/e4cf5ca8-bd22-4211-991a-2d8427195d35">

### All Vehicles

If a user wants to view all vehicles, they can also do that. 

<img width="515" alt="Screenshot 2024-05-10 at 6 06 40 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/ba652d9f-6f36-4c92-bb0d-831aefe07af3">

### Exiting the Application

If at anytime the user wishes to exit, they can enter the exit command, and the application will stop running. 

<img width="405" alt="Screenshot 2024-05-10 at 6 06 52 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/740c7702-e376-4ed6-837d-f165767b99ad">



## Error Handling 

If the user enters an invalid command, they will be told that the command was invalid, and be presented with the menu once again. 

<img width="375" alt="Screenshot 2024-05-11 at 6 46 26 PM" src="https://github.com/hibbaafzal/WorkshopFour_CarDealership/assets/166542360/f562eef9-05ab-4e9c-b730-62b195cd5e40">


#### Interesting Piece of Code

                   
               
                    Dealership.filterByPrice(minPrice, maxPrice);


                   

I found this interesting because for every filtered search a new static method had to be created and called in the UserInterface class. 
