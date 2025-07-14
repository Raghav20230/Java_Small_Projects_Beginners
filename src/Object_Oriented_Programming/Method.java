package Object_Oriented_Programming;

public class Method {
    String name;
    public void eat(){
        System.out.println(name+" Eats!");
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.name="Bruno";
        m.eat();
    }
}
