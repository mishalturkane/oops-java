package abstraction;

public class Car {
    private void moveBreake(){}
    private void changePistonSpeed(){}
    private void createSpark(){}

    public void turOnCar(){
        createSpark();
    }
    public void accelarate(){
        changePistonSpeed();
    }
    public void breakCar(){
        moveBreake();
    }

}
