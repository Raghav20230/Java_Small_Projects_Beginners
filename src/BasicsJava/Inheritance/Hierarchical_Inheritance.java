package BasicsJava.Inheritance;


class Ajay {
    public void print() {
        System.out.println("Ajay class");
    }
}
    class Raghav extends Ajay {
        public void printR() {
            System.out.println("Raghav class print using ajay class");
        }
    }
        class Durgesh extends Ajay{
            public void printD(){
                System.out.println("Durgesh class print using ajay class this is called hierarchical using parent class print more classes");
            }
        }
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Raghav obj = new Raghav();
        Durgesh obj1=new Durgesh();
        obj.print();
        obj1.print();
    }
}
