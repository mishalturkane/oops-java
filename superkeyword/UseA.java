package superkeyword;

class A{
   /* public A(){
        System.out.println("non paramitrized constructor called");
    }*/
    public A(String name){
        System.out.println("paramitrized constructor called="+name);
    }
}
class B extends A{
    public B(){
        super("A ka wala");
        System.out.println("non paramitrized constructor called");
    }
}
public class UseA {xxxxxdd
    public static void main(String[] args) {
        B b=new B();
    }

}
