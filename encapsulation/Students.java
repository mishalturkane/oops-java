package encapsulation;

public class Students {
    private int roll;
    private String name;
    private double cgpa;

     //Encapsulation example
    public void setStudents(int r,String n,double c){
        roll=r;
        name=n;
        cgpa=c;
    }
    public void showStudents(){
        System.out.println("Roll:" +roll+
                "\t"+   "Name:"+name+
                "\t"+    "Cpga:"+cgpa
                );
    }
}
