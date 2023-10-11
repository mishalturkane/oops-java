package statickeyword;

class Demo{
    int a;
    static int b;


}
public class StaticDemo {
    public static void main(String[] args) {
     Demo d=new Demo();
     Demo e=new Demo();
     d.a=10;
     d.b=20;
     e.a=30;
     e.b=40;

        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(e.a);
        System.out.println(e.b);
    }
}
