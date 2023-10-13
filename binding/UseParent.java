package binding;

class Parent{
    public  static  void show(){ /*** Early binding */
        System.out.println("show of parent class");
    }
    public void display(){    /*** Late binding */
        System.out.println("display of parent class");
    }
}
class Child extends  Parent{
    public  static  void show(){ /*** Early binding */
        System.out.println("show of child class");
    }
    public void display(){     /*** Late binding */
        System.out.println("display of child class");
    }
}
public class UseParent {
    public static void main(String[] args) {
     Child c=new Child();
     Child.show();
     c.display();
    }
}
