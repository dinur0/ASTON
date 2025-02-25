package Animals;

public class Fish extends Animal implements Swimmable{
    Fish(String name) {
        super("Рыба");
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
