package Facade;

public class SteeringRack implements Car{
    @Override
    public void left() {
        System.out.println("Turn wheels to the left");
    }

    @Override
    public void right() {
        System.out.println("Turn wheels to the right");
    }
}
