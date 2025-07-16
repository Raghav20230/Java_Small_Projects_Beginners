package BasicsJava.Inheritance;

class Vechicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class Car extends Vechicle{
    String fuelType;
    boolean sunroof;
    String brand;
}
public class Inheritance{
    public static void main(String[] args) {
        Car c = new Car();
         c.brand="Tata";
         c.mileage=18.3;
         c.price=44343242;
         c.fuelType="Petrol";
         c.sunroof=true;
         c.color="red";
         c.display();
    }
}
