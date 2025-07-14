package Object_Oriented_Programming;

public class Fundamental {
    //class is blueprint of object(Behavior,properties)
    //code zyada nahi likhna h toh object oriented programming use krte h
    int a=10;
    String name="Raghav";

    //changing variable using refernce value
    public static void main(String[] args) {
        Fundamental fun = new Fundamental();
        System.out.println(fun.a);
        System.out.println(fun.name);
        System.out.println("----------------------");
        fun.a=11;
        fun.name="singh";
        System.out.println(fun.a);
        System.out.println(fun.name);
    }
}
