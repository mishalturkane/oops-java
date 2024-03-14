package ArrayBasics;

public class Demo {
    // types of declaring Array
    public static void main(String[] args) {
       //1st Approch
     int arr[]=new int[]{10,20,30,40,40};
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

// 2nd Approch
        int brr[]=new int[5];
          brr[0]=10;
           brr[1]=20;
        brr[2]=30;
        brr[3]=40;
        brr[4]=50;
        for(int i=0;i<5;i++){
            System.out.println(brr[i]);
        }

        System.out.println();
//3rd approach
        int crr[]={10,20,30,40,40};
        for(int i=0;i<5;i++){
            System.out.println(crr[i]);

        }
        System.out.println();

 //4rth approach
     int frr[];
     frr=new int[5];
     frr[0]=10;
        frr[1]=20;
        frr[2]=30;
        frr[3]=40;
        frr[4]=50;
        for(int i=0;i<5;i++){
            System.out.println(frr[i]);
        }
    }
}
