package statickeyword;
class Circle2{

   /*int a=10;*/
    static int a=10;
}
public class StaticMethodDemo2 {
    public static void main(String[] args) {
        /*Circle2 c2=new Circle2();
        System.out.println(c2.a);*/

        System.out.println(Circle2.a);
    }
}
