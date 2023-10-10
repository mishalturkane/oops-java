package constructor;

public class Accounts {
     private int accId;
     private String accName;
     private double accSalary;


     public Accounts(int id,String name,double salary){
         accId=id;
         accName=name;
         accSalary=salary;
         System.out.println("Constructor called");
     }

     public  void  showAccounts(){
         System.out.println("id is:"+accId);
         System.out.println("Name is:"+accName);
         System.out.println("Salary is:"+accSalary);
     }
}
