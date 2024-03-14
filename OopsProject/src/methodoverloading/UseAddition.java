package methodoverloading;

public class UseAddition {
    public static void main(String[] args){
        Addition obj=new Addition();
        System.out.println("Sum of 10 and 20 ="+obj.add(10,20));
        System.out.println("Sum of 10.5 and 20.6="+obj.add(10.5,20.6));
        System.out.println("Sum of Good and Morning="+obj.add("Good","Morning"));
    }
}
