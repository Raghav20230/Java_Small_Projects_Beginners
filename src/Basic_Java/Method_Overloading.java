package Basic_Java;

class Calculator{
    public int add(int n1 ,int n2){
        return n1+n2;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int result= c1.add(3,4);
        System.out.println(result);
    }
}
