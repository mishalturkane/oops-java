package getter$setter;

public class Product {
    private int id;
    private  String name;
    private double price;
    public Product(int i,String s,double p){
        id=i;
        name=s;
        price=p;
    }
    public void setName(String s){
        name=s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
