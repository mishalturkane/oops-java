package ExceptionHandling;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOperation;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Date;

public class Person {
    private int age;
    private String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
}
class UsePerson{
    public static void main(String[] args) {
        Person p1=new Person(25,"Bade");
        System.out.println(p1);      //System.out.println(p.toString()); ye automatcally ho jata hai by java compiler.
        String name="Boo";
        System.out.println(name);
        Date d= new Date();
        System.out.println(d);
    }

}

