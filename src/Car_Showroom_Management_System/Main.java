package Car_Showroom_Management_System;


import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

interface Utility{
    public void get_details();
    public void set_details();
}

public class Main {
    public static void main_menu() {
        System.out.println();
        System.out.println("========================= *** WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM *** ==================");
        System.out.println();
        System.out.println("============== **ENTER YOUR CHOICE ** ===================");
        System.out.println();
        System.out.println("1.]ADD SHOWROOM \t\t\t 2]ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4.]GET SHOWROOM \t\t\t 5]GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("================ *** ENTER 0 TO EXIT *** ====================");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Showroom showroom[]=new Showroom[5];
        Employees employees[]=new Employees[5];
        Cars cars[]=new Cars[5];

        int car_counter=0;
        int showroom_counter=0;
        int employees_conter=0;
        int choice=100;
        while (choice!=0){
            main_menu();
            choice=scn.nextInt();
            while (choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter]=new Showroom();//arrayb of showroom start with showroom counter with 0
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scn.nextInt();
                        break;
                    case 2:
                        employees[employees_conter]=new Employees();//arrayb of showroom start with showroom counter with 0
                        employees[employees_conter].set_details();
                        employees_conter++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEES");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scn.nextInt();
                        break;
                    case 3:
                        cars[car_counter]=new Cars();//arrayb of showroom start with showroom counter with 0
                        cars[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW CAR");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scn.nextInt();
                        break;
                    case 4:
                        for (int i =0;i < showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = scn.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i<employees_conter;i++){
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice=scn.nextInt();
                        break;
                    case 6:
                        for (int i=0;i<car_counter;i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                         System.out.println();
                         System.out.println("9].GO BACK TO MAIN MENU");
                         System.out.println("0].EXIT");
                         choice=scn.nextInt();
                         break;
                    default:
                        System.out.println("ENTER A VALID CHOICE: ");
                        break;
                }
            }

        }

    }
}
