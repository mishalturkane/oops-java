package constructor;

public class UseAccounts {
    public static void main(String[] args) {
        Accounts obj1=new Accounts(101,"Mishal",5600.0);
        obj1.showAccounts();
        Accounts obj2=new Accounts(102,"Vilash",78000.0);
        obj2.showAccounts();
    }
}
