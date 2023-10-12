package thiskeyword;

public class Box {
    private int length,breath,height;
    public Box(int length,int breath,int height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    public Box(int side){
      /*  length=side;
        breath=side;
        height=side;*/
        this(side,side,side);
    }
    public Box(){
       /* length=0;
        breath=0;
        height=0;*/
        this(0,0,0);
    }
    public void showBox(){
        System.out.println("length="+length+",brerath="+breath+",height="+height);
    }
}

