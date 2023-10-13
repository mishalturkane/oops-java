package pollymorphism.compiletime;

public class Shape {
    public void area(double radius){
        double are=Math.PI*Math.pow(radius,2 );
        System.out.println("Area of circle is="+are);
    }
    public void area(int side){
        int are=side*side;
        System.out.println("Area of square is="+are);
    }
    public void area(int length,int height){
        int are=length*height;
        System.out.println("Area of Rectangle="+are);
    }
}
