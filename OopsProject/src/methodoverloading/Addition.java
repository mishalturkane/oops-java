package methodoverloading;

public class Addition {
    public  int add(int a,int b){
        int c=a+b;
        return c;
    }
    public double add(double i,double j){
        double k=i+j;
        return k;
    }
    public String add(String s1,String s2){
        String s3=s1+s2;
        return s3;
    }
}
