package Car;

public class Main {
    void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car(1, 75);

        car.initialStatus();
        car.setStart();
        car.setAccelerate(50);
        car.setAccelerate(50);
        car.setAccelerate(10);

        car.initialStatus();
        car.isTurnLeft();
        car.isTurnRight();

        //car2
        car2.initialStatus();
    }
}
