package Car_Showroom_Management_System;

import java.util.Scanner;

public class Showroom implements Utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stocks=0;
    String manager_name;

    public void get_details(){
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total_Cars_In_Stocks: "+total_cars_in_stocks);
        System.out.println("Manager_Name: "+manager_name);
    }
    public void set_details() {
        Scanner scn = new Scanner(System.in);
        System.out.println("============================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("Enter Showroom Name");
        showroom_name = scn.nextLine();
        System.out.println("Enter Showroom Address");
        showroom_address = scn.nextLine();
        System.out.println("Enter Total Employees");
        total_employees = scn.nextInt();
        System.out.println("Enter Total Cars In Stocks");
        total_cars_in_stocks = scn.nextInt();
        scn.nextLine(); // consume newline
        System.out.println("Enter Manager Name");
        manager_name = scn.nextLine();
    }
}
