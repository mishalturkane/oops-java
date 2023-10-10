package gattersetter;

public class Products {
    private int id;
    private String name;
    private double price;

    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public void setPrice(double p){
        price=p;
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
