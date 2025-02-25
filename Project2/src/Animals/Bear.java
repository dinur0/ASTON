package Animals;

public class Bear extends Mammal implements HasFur{
    Bear(String name) {
        super("Медведь");
    }

    @Override
    void say() {
        System.out.printf("%s рычит",super.name);
    }

    @Override
    public void show_fure() {
        System.out.printf("У %s есть шерсть",super.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
