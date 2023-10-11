package statickeyword;

import java.util.Scanner;

class Accounts1{
    private int accId;
    private String accName;
    private double balance;
    private static int rateOfint;

    static{
        System.out.println("enter rateofInterest");
        Scanner kb=new Scanner(System.in);
        rateOfint=kb.nextInt();
        System.out.println("sttaic block called.....");
    }
    public Accounts1(int id,String name,double bal){
        accId=id;
        accName=name;
        balance=bal;
        System.out.println("Constructor called...");
    }
    public void show(){
        System.out.println(accId+","+accName+","+balance+","+rateOfint);
    }
}
public class StaticBlock {
    public static void main(String[] args) {
         Accounts1 acc=new Accounts1(34,"Mishal",89999.0);
        Accounts1 acc2=new Accounts1(35,"Vishal",99999.0);
         acc.show();
         acc2.show();
    }
}
