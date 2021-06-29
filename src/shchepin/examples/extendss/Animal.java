package shchepin.examples.extendss;

public class Animal extends AbstractAnimal {
    public Animal(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Animal{} " + super.toString();
    }
}
