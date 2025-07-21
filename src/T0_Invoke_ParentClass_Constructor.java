class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}
    class Dog extends Animal{

        Dog(){
            super();
           // System.out.println("Dog is created");
        }
    }


public class T0_Invoke_ParentClass_Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}