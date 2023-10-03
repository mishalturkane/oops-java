package objclasses;

import java.util.Scanner;

public class Pime {
    public static void main(String[] args) {
     Prime();
    }
    public static void Prime(){
        Scanner kb=new Scanner(System.in);

        System.out.println("Kaha tak prime nu. chahiye; ");
        double size=kb.nextInt();
        double  j,count=0;
        for(double i=0;i<size;i++){
            for(  j=2;j<=i-1;j++) {
                if (i % j == 0)
                    break;
            }
            if(i==j){
                System.out.println("Number is prime: "+i);
                count++;
            }

        }
        System.out.println("Total prime numbers from "+size+" is "+count);
    }
}
