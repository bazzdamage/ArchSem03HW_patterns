package Facade;

public class TurnSignal implements Car{
    @Override
    public void left() {
        System.out.println("Left turn signal is blinking");
    }

    @Override
    public void right() {
        System.out.println("Right turn signal is blinking");
    }
}
