package Animals;

public class Whale extends Animal implements Swimmable{
    Whale(String name) {
        super("Кит");
    }

    @Override
    void say() {
        System.out.println("Бульк...");
    }

    @Override
    public void live_in_water() {
        System.out.printf("%s живет в воде",super.name);
    }
}
