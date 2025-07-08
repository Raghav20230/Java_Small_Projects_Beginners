import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String item;
        double price;
        int  Quantity;
        char Currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item=scn.nextLine();

        System.out.print("What is the price of each?: ");
        price=scn.nextDouble();

        System.out.print("How many would you like: ");
        Quantity= scn.nextInt();

        total=Quantity*price;

        System.out.println("you have bought "+ Quantity + " "+item +"/s");
        System.out.println("your total is "+Currency + total);

        scn.close();
    }
}
