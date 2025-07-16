package BasicsJava.Inheritance;

public class Interface {
    //An interface is a blueprint of a class that defines abstract methods (no implementation) and
    // constants (public static final variables).
    // It is used to achieve abstraction and multiple inheritance in Java.

    //->Key Properties of Interfaces
    //All methods: are public & abstract by default (before Java 8).
    //
    //All variables:are public, static, and final (constants).
    //
    //A class implements an interface (instead of extends).
    //
    //A class can implement multiple interfaces (solving multiple inheritance issues).

   // Why Use Interfaces? (Advantages & Disadvantages)
    //Advantages (Fayade)
    //✅ Achieves Abstraction – Hides implementation details.
    //✅ Supports Multiple Inheritance – A class can implement multiple interfaces.
    //✅ Loose Coupling – Classes depend on behavior, not implementation.
    //✅ Enforces Contracts – Ensures implementing classes define required methods.
    //✅ Default & Static Methods (Java 8+) – Can have method implementations.
    //
    //Disadvantages (Nuksaan)
    //❌ No Constructors – Cannot create objects directly.
    //❌ No Instance Variables – Only constants allowed.
    //❌ Limited Logic Before Java 8 – Only abstract methods were allowed.

    //Basic Syntax:
    //interface InterfaceName {
    //    // Constant (public static final by default)
    //    String CONSTANT = "VALUE";
    //
    //    // Abstract method (public abstract by default)
    //    void method1();
    //
    //    // Default method (Java 8+)
    //    default void method2() {
    //        System.out.println("Default method");
    //    }
    //
    //    // Static method (Java 8+)
    //    static void method3() {
    //        System.out.println("Static method");
    //    }
    //}

    //Example: Vehicle Interface

    //interface Vehicle {
    //    // Constant
    //    String TYPE = "Transport";
    //
    //    // Abstract method (must be implemented)
    //    void start();
    //
    //    // Default method (optional to override)
    //    default void stop() {
    //        System.out.println("Vehicle stopped.");
    //    }
    //
    //    // Static method (called via interface)
    //    static void honk() {
    //        System.out.println("Honk honk!");
    //    }
    //}
    //
    //class Car implements Vehicle {
    //    @Override
    //    public void start() {
    //        System.out.println("Car started.");
    //    }
    //}
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        Car car = new Car();
    //        car.start();  // Output: "Car started."
    //        car.stop();   // Output: "Vehicle stopped."
    //        Vehicle.honk(); // Output: "Honk honk!"
    //    }
    //}

    //4. When to Use Class vs Interface?
    //Feature	Class	Interface
    //Inheritance	Single inheritance (extends)	Multiple inheritance (implements)
    //Methods	Can have concrete methods	Only abstract (before Java 8)
    //Variables	Can have instance variables	Only constants (public static final)
    //Constructor	Can have constructors	No constructors
    //Usage	For concrete implementations	For defining contracts
    //When to Use?
    //Use Class → When you need state (fields) & behavior (methods).
    //
    //Use Interface → When you need multiple inheritance or define a contract.


    //. Multiple Inheritance Using Interface
    //Since Java doesn’t allow multiple inheritance with classes, interfaces solve this problem.

    //interface A {
    //    void showA();
    //}
    //
    //interface B {
    //    void showB();
    //}
    //
    //class C implements A, B {  // Multiple inheritance
    //    @Override
    //    public void showA() {
    //        System.out.println("A");
    //    }
    //
    //    @Override
    //    public void showB() {
    //        System.out.println("B");
    //    }
    //}
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        C obj = new C();
    //        obj.showA();  // Output: "A"
    //        obj.showB();  // Output: "B"
    //    }
    //}

    //6. New Features in Interfaces (Java 8+)
    //1. Default Methods
    //Provide a default implementation.
    //
    //Optional to override.
    //
    //java
    //interface Animal {
    //    default void eat() {
    //        System.out.println("Animal is eating.");
    //    }
    //}
    //2. Static Methods
    //Called via interface name.
    //
    //Cannot be overridden.
    //
    //java
    //interface MathOperations {
    //    static int add(int a, int b) {
    //        return a + b;
    //    }
    //}
    //
    //// Usage:
    //int sum = MathOperations.add(5, 10);
    //3. Functional Interfaces (Java 8)
    //Only one abstract method (used for Lambda Expressions).
    //
    //Example: Runnable, Comparator.
    //
    //java
    //@FunctionalInterface
    //interface Greeting {
    //    void greet(String name);
    //}
    //
    //// Lambda usage:
    //Greeting g = (name) -> System.out.println("Hello, " + name);
    //g.greet("Alice");  // Output: "Hello, Alice"


    //Interview Questions & Answers
    //Q1. Why is multiple inheritance not allowed in Java classes?
    //Answer:
    //Because it leads to the diamond problem (ambiguity when two parent classes have the same method).
    //Solution: Interfaces allow multiple inheritance since they don’t contain method implementations.

    //Q2. Can an interface extend another interface?
    //✅ Yes!
    //interface A {
    // void methodA();
    // }
    //interface B extends A {
    // void methodB();
    // }

    //Q3. Can an interface have a constructor?
    //Answer:
    //❌ No, because interfaces cannot be instantiated.

    //Q4. What happens if a class implements two interfaces with the same default method?
    //Answer:
    //The class must override the method to resolve ambiguity.
    //interface X { default void show() { System.out.println("X"); } }
    //interface Y { default void show() { System.out.println("Y"); } }
    //
    //class Z implements X, Y {
    //    @Override
    //    public void show() {
    //        System.out.println("Z");
    //    }
    //}


    //Q5. Can we declare an interface as final?
    //Answer:
    //❌ No, because interfaces are meant to be implemented by classes.
}
