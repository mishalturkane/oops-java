package inheritance.hierarchical;

public class Trilok {
    public Trilok(){
        System.out.println("Papa name is Trilok");
    }
    public void sername(){
        System.out.println("Aur sername is Turkane");
    }
}
class Mishal extends Trilok{

    public Mishal(){
        System.out.println("My name is Mishal");
    }
    public void age(){
        System.out.println("Meri age h 19");
    }
    public void color(){
        System.out.println("main hu thoda gora");
    }
    public static void main(String[] args) {
        Mishal missu=new Mishal();
        missu.sername();
        missu.color();
        missu.age();
    }
}
class Vilash extends  Trilok{
    public Vilash(){
        System.out.println("My nam is Vilash");
    }
    public void age(){
        System.out.println("Meri age h 16");
    }
    public void color(){
        System.out.println("main hu thoda sawla");
    }
    public static void main(String[] args) {
        Vilash illu=new Vilash();
        illu.sername();
        illu.color();
        illu.age();
    }
}