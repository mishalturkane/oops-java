package argumentpassing;

public class Demo {
    public static void main(String[] args) {
      int a=10,b=20;
      System.out.println("Before increment the value:"+a+" ,"+b);
      incremnt(10,20);
      System.out.println("Before increment the value:"+a+" ,"+b);
    }
    public static  void incremnt(int a,int b){
        a=a+5;
        b=b+5;
    }
}
