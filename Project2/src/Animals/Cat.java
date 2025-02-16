package Animals;

public class Cat extends Mammal implements HasFur{
    Cat(String name) {
        super("Кот");
    }

    @Override
    void say() {
        System.out.printf("%s мяукает",super.name);
    }

    @Override
    public void show_fure() {
        System.out.printf("У %s есть шерсть",super.name);
    }
}
