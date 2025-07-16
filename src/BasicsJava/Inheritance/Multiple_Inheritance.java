package BasicsJava.Inheritance;

public class Multiple_Inheritance {
    //Java does not support multiple inheritance of classes
    // (where a class can inherit from more than one parent class) to avoid the "diamond problem"
    // and keep the language simpler. Here's why:
    //The Diamond Problem
    //The main issue with multiple inheritance is the ambiguity that can arise when:
    //Two parent classes have methods with the same signature
    //Both parent classes inherit from a common ancestor
    class A {
        void show() {
            System.out.println("A's show");
        }
    }

    class B extends A {
        void show() {
            System.out.println("B's show");
        }
    }

    class C extends A {
        void show() {
            System.out.println("C's show");
        }
    }

// If Java allowed multiple inheritance:
// class D extends B, C { }  // Which show() should be called?

 //In this case, if class D could extend both B and C, and you called show(),
    // the compiler wouldn't know whether to use B's version or C's version

    //Java's Solution
    //Java provides two alternatives:
    //
    //Single Inheritance + Interfaces: A class can implement multiple interfaces but extend only one class
    //
    //Composition: Favor object composition over inheritance

   // Allowed Alternative (Interfaces):
    //interface A {
    //    void show();
    //}
    //
    //interface B {
    //    void show();
    //}
    //
    //class C implements A, B {
    //    // Must implement show() to resolve ambiguity
    //    public void show() {
    //        System.out.println("C's implementation");
    //    }
    //}
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        C obj = new C();
    //        obj.show();  // Output: C's implementation
    //    }
    //}
}
