package getter$setter;

public class UseProduct {
    public static void main(String[] args){
       Product p=new Product(101,"Meggi",34.0);
        System.out.println("Product name="+p.getName());
        System.out.println("Product id="+p.getId());
        System.out.println("Product Price="+p.getPrice());
        System.out.println("After changing Name....");
       p.setName("Atta Meggi");
        System.out.println("Product name="+p.getName());
        System.out.println("Product id="+p.getId());
        System.out.println("Product Price="+p.getPrice());
    }
}
