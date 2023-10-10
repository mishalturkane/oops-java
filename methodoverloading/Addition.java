package methodoverloading;

public class Addition {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public String add(String s,String ss){
        return s+ss;
    }
    public  void show(int id){
        System.out.println(id);
    }
    public void show(int id,String name){
        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);
    }
}
