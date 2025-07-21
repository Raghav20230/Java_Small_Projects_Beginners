package BasicsJava.Inheritance;


class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        super(); // Calls A's constructor
        System.out.println("B constructor");
    }
}

class C extends B {
    C() {
        super(); // Calls B's constructor
        System.out.println("C constructor");
    }
}
public class Multi_Level_inheritance {
    public static void main(String[] args) {
        C c=new C();
        c.toString();
    }
}
