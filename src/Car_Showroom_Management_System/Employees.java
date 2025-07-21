package Car_Showroom_Management_System;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    public void get_details(){
        System.out.println("ID: "+emp_id);
        System.out.println("Emp Name: "+emp_name);
        System.out.println("Emp Age: "+emp_age);
        System.out.println("Emp Department: "+emp_department);
        System.out.println("Showroom Name: "+showroom_name);
    }
    public void set_details() {
        Scanner scn = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("========================*** ENTER EMPLOYEE DETAILS ***========================");
        System.out.println();
        System.out.println("Enter Employee Name: ");
        emp_name = scn.nextLine();
        System.out.println("Enter Employee Age: ");
        emp_age = scn.nextInt();
        scn.nextLine(); // consume newline
        System.out.println("Enter Employee Department: ");
        emp_department = scn.nextLine();
        System.out.println("Enter Showroom Name: ");
        showroom_name = scn.nextLine();
    }
}
