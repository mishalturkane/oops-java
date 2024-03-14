package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DivideAndSum1 {
    public static void main(String[] args) {
        int a=0,b=0;
        try
        {
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter 2 int:10");
            a=kb.nextInt();
            b=kb.nextInt();
            int c=a/b;
            System.out.println("Div is :"+c);
        }
        catch(ArithmeticException ex){
            System.out.println("Denomireter is not be Zero");
        }
        catch(InputMismatchException ex){
            System.out.println("Pls input digit only");
            System.exit(0);
        }
        int d=a+b;
        System.out.println("Sum is :"+d);
    }
}
