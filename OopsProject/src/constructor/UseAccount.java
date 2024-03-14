package constructor;

public class UseAccount {
    public static void main(String[]args){
        Account obj=new Account( 101,"Amit",50000.0);
        Account obj2=new Account(102,"Mishal",75000.0);
        obj.showAccount();
        obj2.showAccount();
    }
}
