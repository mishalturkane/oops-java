package constructor;

public class Account {
    private int acctId;
    private String name;
    private double balance;

    public Account(int id, String n, double bal) {
        acctId = id;
        name=n;
        balance=bal;
    }
    public void showAccount(){
        System.out.println("id="+acctId);
        System.out.println("Name="+name);
        System.out.println("Balance="+balance);
    }
}