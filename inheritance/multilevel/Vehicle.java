package inheritance.multilevel;

public class Vehicle {
    public void who(){
        System.out.println("i am vehicle");
    }
}
class Car extends Vehicle{
    public void wheels(){
        System.out.println("I am 4 wheels");
    }

    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.who();
        bmw.wheels();
    }

}
class DriverlessCar extends Car{
    public void drive(){
        System.out.println("i dont have any driver for driving a car ");
    }

    public static void main(String[] args) {
        DriverlessCar tesla=new DriverlessCar();
        tesla.who();
        tesla.wheels();
        tesla.drive();
    }
}