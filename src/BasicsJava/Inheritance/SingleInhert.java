package BasicsJava.Inheritance;

class Employee {
    void salary() {
        System.out.println("10_000");
    }
}

class HR extends Employee {
    void bonus() {
        System.out.println("10_00_00");
    }
}

public class SingleInhert {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.salary();  // Inherited from Employee
        hr.bonus();   // From HR class
    }
}