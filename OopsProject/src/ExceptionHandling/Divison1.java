package ExceptionHandling;

import java.util.Scanner;

public class Divison1 {
    public static void main(String[] args) {
        int a=0,b=0;
        try{
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter 2 int:");

            a=kb.nextInt();
            b=kb.nextInt();
            int c=a/b;
            System.out.println("Div is:"+c);
        }
        catch (Exception ex){         //Exception class override the ToSring () method & return
            System.out.println(ex);  //Exception class name,Error msg i.s resone of Exception
        }
    }
}
