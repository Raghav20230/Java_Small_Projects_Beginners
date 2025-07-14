package Small_Projects_ForLearning;

import java.util.Scanner;

class ATM{
    float Balance;
    int pin_Code;
    ATM(int pin_Code){
        this.pin_Code=pin_Code;
    }
    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner scn = new Scanner(System.in);
        int enterpin=scn.nextInt();
        if (enterpin==pin_Code){
            menu();
        }
        else {
            System.out.println("Enter a Valid Pin: ");
            Scanner scn1 = new Scanner(System.in);
            int enterpin1=scn1.nextInt();
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter your choices: ");
        System.out.println("1.Check account balance: ");
        System.out.println("2.Withdraw money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. Exit");

        Scanner scn = new Scanner(System.in);
        int options=scn.nextInt();
        if (options==1){
            checkBalance();
        } else if (options==2) {
            withdrawMoney();
        } else if (options==3) {
            depositMoney();
        } else if (options==4) {
            return;
        }else {
            System.out.println("Enter a valid choice: ");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney(){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        float amount=scn.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance: ");
        }
        else {
            Balance=Balance-amount;
            System.out.println("Money withdrawal successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner scn = new Scanner(System.in);
        float amount= scn.nextFloat();
        Balance=Balance + amount;
        System.out.println("Money Deposit Successfully ");
        menu();
    }
}
public class Atm_Machine_Project_Using_Classes$Object {
    public static void main(String[] args) {
    ATM a=new ATM(1234);
    a.checkPin();
    }
}
