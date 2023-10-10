package gattersetter;

public class ProductsAd {
    private int id;
    private String name;
    private double price;

    public  ProductsAd(int i,double p){
        id=i;
        price=p;
    }
    public void setName(String n){
        name=n;
    }
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
