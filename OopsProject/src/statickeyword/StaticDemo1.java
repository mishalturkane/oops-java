package statickeyword;

 class Demo {
    int a;
    static int b;
}
public class StaticDemo1{
    public static void main(String[] args){
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.a=10;
        d2.a=20;
        d3.a=30;
        System.out.println("d1.a="+d1.a+",d2.a="+d2.a+",d3.a="+d3.a);
        d1.b=10;
        d2.b=20;
        d3.b=30;
        System.out.println("d1.b="+d1.b+",d2.b="+d2.b+",d3.b="+d3.b);
    }
}
