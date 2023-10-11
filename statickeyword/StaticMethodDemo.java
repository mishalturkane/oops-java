package statickeyword;
class Circle{  ///Utility class //
   /*** public  int sum(int a,int b){
        return a+b;
    }*/

   public  static int sum(int a,int b){
       return a+b;
   }
}
public class StaticMethodDemo {
    public static void main(String[] args) {
       /*** Circle c=new Circle();
        int sum =c.sum(10,20);
        System.out.println(sum);*/
        System.out.println("Sum is "+Circle.sum(10,20));

    }
}
