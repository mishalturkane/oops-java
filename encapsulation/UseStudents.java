package encapsulation;

public class UseStudents {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.setStudents(101,"Mishal",6.9);
        s1.showStudents();

        Students s2=new Students();
        s2.setStudents(46,"Pratima",9.9);
        s2.showStudents();

    }
}
