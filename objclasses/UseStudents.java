package objclasses;

import java.util.Scanner;

public class UseStudents {
    public static void main(String[] args) {
        Students s=new Students();
        s.roll=34;
        s.name="Mishal";
        s.cgpa=6.9;
        System.out.println("Roll :"+s.roll+"\t Name: "+s.name+"\t Per: "+s.cgpa);

    }
}
