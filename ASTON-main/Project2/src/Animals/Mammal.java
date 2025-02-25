package Animals;

abstract class Mammal extends Animal implements HaveSpine{

    Mammal(String name) {
        super(name);
    }

    @Override
    public void spineInfo() {
        System.out.printf("У %s есть позвоночник",super.name);
    }
}
