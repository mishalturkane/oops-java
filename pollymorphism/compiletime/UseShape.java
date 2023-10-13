package pollymorphism.compiletime;

public class UseShape {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area(10);
        s.area(10,20);
        s.area(89.8);
    }
}
