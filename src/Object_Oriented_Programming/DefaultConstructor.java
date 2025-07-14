package Object_Oriented_Programming;
class Student{
        int id;
        int age;
        Student(int id ,int age){
            this.id=id;
            this.age=age;
            System.out.println("Paramterized consturctor");
        }
        Student(){
            System.out.println("Default Constructor");
        }
    }
public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
