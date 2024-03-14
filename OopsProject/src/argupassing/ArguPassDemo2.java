package argupassing;


public class ArguPassDemo2 {
    public static void main(String [] args){

        int x=10,y=20;

        System.out.println("Before increamenting ,x="+x+",y"+y);
        inceament(x,y);
        System.out.println("After increamenting ,x="+x+",y"+y);
    }
    public static void inceament(int a,int b){
        a=a+5;
        b=b+5;
    }
}

