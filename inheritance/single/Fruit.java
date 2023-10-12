package inheritance.single;

public class Fruit {
    private String color;
    public void who(){
        System.out.println("I am fruit");
    }
}
class Apple extends Fruit{
    private String color;
    public void test(){
        System.out.println("i am sweet");
    }
    public static void main(String[] args) {
        Apple ap=new Apple();
        ap.test();
        ap.who();
    }
}
