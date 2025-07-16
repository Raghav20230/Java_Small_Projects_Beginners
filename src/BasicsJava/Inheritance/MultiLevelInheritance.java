package BasicsJava.Inheritance;
class A {
    void methodA() {
        System.out.println("A method ");
    }
}
    class B extends A {
        void methodB() {
            System.out.println("B method ");
        }
    }
        class C extends B{
            void methodC(){
                System.out.println("C method");
            }
        }
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
