package statickeyword;

 class Emp {
     private int age;
     private String name;
     private  String company="Amozon";
     public Emp(int a,String n){
         age=a;
         name=n;
     }
    public void display(){
        System.out.println("age="+age+",name="+name+"company="+company);
    }
 }
public class StaticDemo2{
    public static void main(String[] args){
        Emp e=new Emp(21,"Deepak");
        Emp f=new Emp(20,"Amit");
        Emp g=new Emp(23,"Ravi");
        e.display();
        f.display();
        g.display();
    }
}