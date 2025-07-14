package Small_Projects_ForLearning;

import java.util.Scanner;

public class Compound_Intrest_calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=scn.nextDouble();

        System.out.print("Enter the intrest  rate (in %): ");
        rate=scn.nextDouble();

        System.out.print("Enter the #  of  times Compounded per year: ");
        timesCompounded=scn.nextInt();

        System.out.print("Enter the  number years: ");
        years=scn.nextInt();

        amount=principal+Math.pow(1+rate / timesCompounded,timesCompounded * years);
        System.out.print("The amount after "+ years+" years is: $"+amount);


        scn.close();
    }
}
