package thiskeyword;

public class Student {
    private  int roll;
    private String name;
    private double per;
    public void setStudent(int roll,String name,double per){
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public void show(){
        System.out.println("Roll="+roll+",Name="+name+",per="+per);
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.setStudent(34,"Mishal",89.0);
        s.show();
    }
}
