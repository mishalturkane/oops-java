package argumentpassing;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before incrementing");
        System.out.println("Total arraylist:"+myList);
        increment(myList);
        System.out.println("After incrementing");
        System.out.println("Total arraylist:"+myList);
    }
    public static  void increment(ArrayList<Integer> myList){
        myList.add(2);
        myList.add(4);
        myList.add(3);
        myList.add(5);
        System.out.println("Incement wali myLaist  "+myList);
    }
}
