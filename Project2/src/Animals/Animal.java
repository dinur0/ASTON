package Animals;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void say();
}
