package methodoverriding;


class FrontEndEngg{
    public void skiils(){
        System.out.println("i know about HTML+CSS+JS+REACT");
    }
}
class BackEndEngg extends FrontEndEngg{
    public void skiils(){
        System.out.println("I am fullstack developer");
        super.skiils();
        System.out.println("i know about JavaAdvance+Spring+Apache Kafka");
    }
}
public class Developer {
    public static void main(String[] args) {
        BackEndEngg bk=new BackEndEngg();
        bk.skiils();
    }

}
