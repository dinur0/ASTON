package Transport_vehicle;

public class Plane extends Vechile implements HaveWheels, HavePropeller,HaveWings,CanCarryCargo {
    @Override
    public void drive() {
        System.out.printf("%s имеет колеса",super.getName());
    }

    @Override
    public void have_propeller() {
        System.out.printf("%s имеет винт",super.getName());
    }

    @Override
    public void CarryCargo() {
        System.out.printf("%s возит грузы",super.getName());
    }

    @Override
    public void use_wings() {
        System.out.printf("%s имеет крылья",super.getName());
    }
}
