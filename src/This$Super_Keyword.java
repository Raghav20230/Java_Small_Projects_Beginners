//// class  A {
////     void run() {
////
////         System.out.println("Run A");
////     }
//// }
////
////     class B extends A {
////         void run() {
////             System.out.println("Run B");
////
////             this.run();
////         }
////     }
////
////     public class This$Super_Keyword {
////         public static void main(String[] args) {
////             A a = new A();
////                a.run();  // Output: Run A
////             B b = new B();
////             b.run();
////
////         }
////     }
//class Product {
//    protected String name;
//    protected double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//
//class Electronics extends Product {
//    private int warrantyMonths;
//
//    public Electronics(String name, double price, int warrantyMonths) {
//        super(name, price); // Calls Product constructor
//        this.warrantyMonths = warrantyMonths;
//    }
//    public class This$Super_Keyword {
//         public static void main(String[] args) {
//             Product p = new Product("Sumsung",1000.0);
//             Electronics e=new Electronics("Iphone",10000,3);
//         }
//}