package Adapter;

import Facade.Car;

public class SteeringAdapter implements Car {

    private final Tank tank;

    public SteeringAdapter(Tank tank) {
        this.tank = tank;
    }


    @Override
    public void left() {
        tank.TorqueToTheRightTrack();
    }

    @Override
    public void right() {
        tank.TorqueToLeftTrack();
    }
}
