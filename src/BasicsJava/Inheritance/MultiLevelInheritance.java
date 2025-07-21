package BasicsJava.Inheritance;
 class I {
    void methodI() {
        System.out.println("A method ");
    }
}
    class J extends I {
        void methodJ() {
            System.out.println("B method ");
        }
    }
        class K extends J{
            void methodK(){
                // Calls A's constructor
                System.out.println("C method");
            }
        }
public class MultiLevelInheritance {
    public static void main(String[] args) {
        K obj = new K();
        obj.methodI();
        obj.methodJ();
        obj.methodK();
    }
}
