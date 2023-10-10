package gattersetter;

public class UseProducts {
    public static void main(String[] args) {
        ProductsAd pd=new ProductsAd(1,35);
        pd.setName("Maggi");
        System.out.println("id id:"+ pd.getId());
        System.out.println("name is:"+pd.getName());
        System.out.println("price is:"+pd.getPrice());

        pd.setName("Ata Maggi");
        System.out.println("After chnaging the name of profucts");
        System.out.println("id id:"+ pd.getId());
        System.out.println("name is:"+pd.getName());
        System.out.println("price is:"+pd.getPrice());
    }
}
