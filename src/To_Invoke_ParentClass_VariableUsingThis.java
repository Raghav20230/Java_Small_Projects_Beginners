////TO invoke parent class variable using super keyword
//When to use This Keyword?
//When local variable & instance variable have same name
//To call one constructor from another (Constructor Chaining)
  //Ex:-class Student {
//    String name; // Instance variable
//
//    void setName(String name) { // Parameter name
//        this.name = name; // this.name = instance variable
//    }
//}

   //Example 2: Constructor Chaining
    //class Employee {
//    String name;
//    int salary;
//
//    Employee() {
//        this("Default", 0); // Calls 2nd constructor
//    }
//
//    Employee(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//}        Why?
//Avoids code duplication in constructors.

          //2. super Keyword (Parent Class)
//When to use?
//Call parent class method (when overridden)
//Call parent constructor
//examlple
          //class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//class Dog extends Animal {
//    void eat() {
//        super.eat(); // Calls Animal's eat()
//        System.out.println("Dog eats");
//    }
//}  out:Animal eats
//Dog eats


//diffrent example only for instance varibale
//class  Animal{
//    String color="white";
//}
//class Dog extends Animal{
//    String color="black";
//    void printColor(){
//        System.out.println(color);//print color of dog class because not using super
//       System.out.println(super.color);//prints color of animal
//    }
//}
//public class To_Invoke_ParentClass_VariableUsingThis {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.printColor();
//    }
//}

                            //interview question-answer
//Q1: What if we don’t write super() in child constructor?
//→ Java automatically calls super() (default parent constructor).
//→ Problem: If parent has no default constructor, compilation error.

  //Q2: Can this() and super() be together?
//→ No! Both must be first line → Only one can be first.

//Q3: What is the output?
 //class A {
//    A() {
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    B() {
//        System.out.println("B");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        B obj = new B();
//    }
//} output://A
//B
//Why?
//→ super() is called automatically in B() → Runs A() first.


//Final Shortcut Tips
//Keyword	  Use Case	                               Must Be First?
//this	      Call same class constructor/method	    Yes (in constructor)
//super	      Call parent class constructor/method	    Yes (in constructor)

//this() → Same class constructor
//super() → Parent class constructor
//this.method() → Current class method
//super.method() → Parent class method