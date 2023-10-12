package inheritance.multiple;

public class Trilok {
    public  void kon(){
        System.out.println("Main hu papa");
    }
}
class Mishal extends Trilok {
    public  void kon(){
        System.out.println("Main hu mishal");
    }

    public static void main(String[] args) {
        Mishal m=new Mishal();
        m.kon();
    }
}


class Vilash extends Trilok{
    public  void kon(){
        System.out.println("Main hu vilash");
    }

    public static void main(String[] args) {
        Vilash v=new Vilash();
        v.kon();
    }
}