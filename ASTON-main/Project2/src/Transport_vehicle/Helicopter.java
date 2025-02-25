package Transport_vehicle;

public class Helicopter extends Vechile implements HaveWheels, HavePropeller,CanCarryCargo {
    @Override
    public void drive() {
        System.out.printf("%s имеет колесаа",super.getName());
    }

    @Override
    public void have_propeller() {
        System.out.printf("%s имеет винт",super.getName());
    }

    @Override
    public void CarryCargo() {
        System.out.printf("%s возит грузы",super.getName());
    }
}
