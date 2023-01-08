package Decorator;

import Facade.Car;

abstract class PartialTimeAWD implements Car {

    protected Car awdPlug;
    public PartialTimeAWD(Car awdPlug) {
        this.awdPlug = awdPlug;
    }

    public void left() {
        awdPlug.left();
    }

    public void right() {
        awdPlug.right();
    }

}
