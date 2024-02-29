//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner in = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        System.out.println("Vehicle Rental System");
        System.out.println("1. Rent a Car\n2. Rent a Bike\n3. Rent a Truck\n4. View Rented Vehicles\n5. Exit");
        System.out.println("Vehicle Rental System");
        System.out.println("1. Rent a Car\n2. Rent a Bike\n3. Rent a Truck\n4. View Rented Vehicles\n5. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = in.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int carDays = in.nextInt();
                    Car car = new Car(carModel, carDays);
                    rentedVehicles.add(car);
                    System.out.println("Rental Details:");
                    car.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = in.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int bikeHours = in.nextInt();
                    Bike bike = new Bike(bikeBrand, bikeHours);
                    rentedVehicles.add(bike);
                    System.out.println("Rental Details:");
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = in.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = in.nextInt();
                    Truck truck = new Truck(truckType, truckWeeks);
                    rentedVehicles.add(truck);
                    System.out.println("Rental Details:");
                    truck.displayDetails();
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    }
