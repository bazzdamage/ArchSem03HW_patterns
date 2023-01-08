package Decorator;

import Facade.Car;
import Facade.SteeringFacade;

public class Car4WD implements Car {

    SteeringFacade car = new SteeringFacade();
    public Car4WD() {
    }

    @Override
    public void left() {
        car.steerLeft();
    }

    @Override
    public void right() {
        car.steerRight();
    }
}
