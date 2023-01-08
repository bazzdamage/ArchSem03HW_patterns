import Adapter.SteeringAdapter;
import Adapter.T72;
import Decorator.Car4WD;
import Decorator.PartialTimeAWDInTurn;
import Facade.Car;
import Facade.SteeringFacade;

public class Main {
    public static void main(String[] args) {

        System.out.println("Facade DEMO");

        SteeringFacade car = new SteeringFacade();
        car.steerLeft();
        System.out.println();
        car.steerRight();

        System.out.println("\nDecorator DEMO");

        PartialTimeAWDInTurn car4WD = new PartialTimeAWDInTurn(new Car4WD());
        car4WD.left();
        System.out.println();
        car4WD.right();

        System.out.println("\nAdapter DEMO");

        T72 t72 = new T72();
        Car adapter = new SteeringAdapter(t72);
        adapter.left();
        adapter.right();
    }
}
