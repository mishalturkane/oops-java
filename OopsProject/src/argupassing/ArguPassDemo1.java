package argupassing;


class myMath {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum is=" + c);
    }
}
public class ArguPassDemo1 {
    public static void main(String[] args) {
        myMath m = new myMath();
        int x = 10, y = 20;
        m.add(x, y);
    }
}

