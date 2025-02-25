package Animals;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void say();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
