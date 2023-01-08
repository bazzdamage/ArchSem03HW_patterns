package Adapter;

public class T72 implements Tank {

    @Override
    public void TorqueToTheRightTrack() {
        System.out.println("Torque has delivered to the RIGHT Track, T72 is turning left");
    }

    @Override
    public void TorqueToLeftTrack() {
        System.out.println("Torque has delivered to the LEFT Track, T72 is turning right");
    }
}
