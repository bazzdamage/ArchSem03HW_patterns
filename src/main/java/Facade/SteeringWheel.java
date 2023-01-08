package Facade;

public class SteeringWheel implements Car{
    @Override
    public void left() {
        System.out.println("I turn the steering wheel to the left");
    }

    @Override
    public void right() {
        System.out.println("I turn the steering wheel to the right");
    }
}
