package Small_Projects_ForLearning;

import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String adjective1;//(adjective describe something like a fast,slow,cheap,expensive
        String noun1;//noun is person place and things
        String adjective2;
        String verb1;//a verb is an action like sleeping and running
        String adjective3;

        System.out.print("Enter an adjective1(description): ");
         adjective1= scn.nextLine();
        System.out.print("Enter an noun(animal or person): ");
        noun1=scn.nextLine();
        System.out.print("Enter an adjective2(description): ");
        adjective2=scn.nextLine();
        System.out.print("Enter an verb ending with -ing(action): ");
        verb1=scn.nextLine();
        System.out.print("Enter an adjective3(description): ");
        adjective3= scn.nextLine();



        System.out.println("Today i went to a "+adjective1+" zoo.");
        System.out.print("In a exhibit,I saw a "+noun1 + ".");
        System.out.print(noun1 + " was "+adjective2 + " and "+ verb1 + " ! ");
        System.out.print("I was "+adjective3 +" ! ");

        scn.close();

    }
}
