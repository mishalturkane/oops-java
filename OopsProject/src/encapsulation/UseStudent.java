package encapsulation;

public class UseStudent {
    public static void main(String[] args) {
      Student s=new Student();
        s.setStudent(46,"Pratima",6.34);
        s.showStudent();
        System.out.println();
        Student p=new Student();
        p.setStudent(34,"mishal",8.9);
        p.showStudent();
    }
}







