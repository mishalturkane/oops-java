package interfacedemo;

public interface Animal {
    void eat();
}
class Elephent implements Animal{

    @Override
    public void eat() {
        System.out.println("i drink water ");
    }
}
class   Lion implements Animal{

    @Override
    public void eat() {
        System.out.println("i eat matan and other extra khana");
    }
}
class UseAnimal{
    public static void main(String[] args) {
        Animal animal;
        animal=new Elephent();
        animal.eat();
        animal=new Lion();
        animal.eat();
    }
}