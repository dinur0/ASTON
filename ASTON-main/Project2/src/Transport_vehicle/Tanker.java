package Transport_vehicle;

public class Tanker extends Vechile implements HavePropeller,CanCarryCargo {

    @Override
    public void CarryCargo() {
        System.out.printf("%s возит грузы",super.getName());
    }

    @Override
    public void have_propeller() {
        System.out.printf("%s имеет винт",super.getName());
    }
}
