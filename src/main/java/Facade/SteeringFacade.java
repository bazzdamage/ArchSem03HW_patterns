package Facade;

public class SteeringFacade {

    private SteeringRack steeringRack;
    private SteeringWheel steeringWheel;
    private TurnSignal turnSignal;

    public SteeringFacade() {
        steeringRack = new SteeringRack();
        steeringWheel = new SteeringWheel();
        turnSignal = new TurnSignal();
    }

    public void steerLeft() {
        turnSignal.left();
        steeringWheel.left();
        steeringRack.left();
    }

    public void steerRight() {
        turnSignal.right();
        steeringWheel.right();
        steeringRack.right();
    }

}
