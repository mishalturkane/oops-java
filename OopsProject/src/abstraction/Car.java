package abstraction;

public class Car {
    private void moveBreakpads(){

    }
    private void changePistenSpeed(){

    }
    private void creatSpark(){

    }
    public void turnonCar(){
        creatSpark();
    }
    public void accelerate(){
        changePistenSpeed();
    }
    public void brake(){
        moveBreakpads();
    }
}
