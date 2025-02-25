package Transport_vehicle;

public class Truck extends Vechile implements HaveWheels,CanCarryCargo {
    @Override
    public void drive() {
        System.out.printf("%s имеет колеса",super.getName());
    }

    @Override
    public void CarryCargo() {
        System.out.printf("%s возит грузы",super.getName());
    }
}
