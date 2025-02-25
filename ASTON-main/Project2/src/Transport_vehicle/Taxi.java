package Transport_vehicle;

public class Taxi extends Vechile implements HaveWheels {
    @Override
    public void drive() {
        System.out.printf("%s имеет колеса",super.getName());
    }
}