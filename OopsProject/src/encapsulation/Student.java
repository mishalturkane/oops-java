package encapsulation;

public class Student {
    private int roll;  //it is also an Encapsulation.Okkk
    private String name;
    private double per;
    public void setStudent(int r,String n,double p){
        roll=r;
        name=n;
        per=p;
    }
    public void showStudent(){
        System.out.println("Roll="+roll);
        System.out.println("Name="+name);
        System.out.println("per="+per);
    }

}







