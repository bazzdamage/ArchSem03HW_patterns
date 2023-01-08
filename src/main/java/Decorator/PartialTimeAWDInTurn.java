package Decorator;

import Facade.Car;

public class PartialTimeAWDInTurn extends PartialTimeAWD{
    public PartialTimeAWDInTurn(Car awdPlug) {
        super(awdPlug);
    }

    public void left() {
        awdPlug.left();
        switchAWD();
    }

    public void right() {
        awdPlug.right();
        switchAWD();
    }

    private void switchAWD() {
        System.out.println("Rear wheels are plugged in for better grip in turn");
    }

}
