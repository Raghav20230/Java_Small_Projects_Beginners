package Car_Showroom_Management_System;

import java.util.Scanner;

public class Cars extends Showroom implements Utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    public void get_details(){
        System.out.println("CAR NAME: "+car_name);
        System.out.println("CAR COLOR: "+car_color);
        System.out.println("CAR FUEL TYPE: "+car_fuel_type);
        System.out.println("CAR PRICE: "+car_price);
        System.out.println("CAR TRANSMISSION: "+car_transmission);
    }
    public void set_details() {
        Scanner scn = new Scanner(System.in);
        System.out.println("=========================== ***ENTER CAR DETAILS*** ================================");
        System.out.println();
        System.out.println("CAR NAME: ");
        car_name = scn.nextLine();
        System.out.println("CAR COLOR: ");
        car_color = scn.nextLine();
        System.out.println("CAR FUEL TYPE:(PETROL/DIESEL): ");
        car_fuel_type = scn.nextLine();
        System.out.println("CAR TYPE:(SEDAN/SUV/HATCHBACK): ");
        car_type = scn.nextLine();
        System.out.println("CAR PRICE: ");
        car_price = scn.nextInt();
        scn.nextLine(); // consume newline
        System.out.println("CAR TRANSMISSION TYPE:(AUTOMATIC/MANUAL): ");
        car_transmission = scn.nextLine();
        total_cars_in_stocks++;
    }
}
