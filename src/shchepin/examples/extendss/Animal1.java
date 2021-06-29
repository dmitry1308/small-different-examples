package shchepin.examples.extendss;

public class Animal1 extends AbstractAnimal {
    public Animal1(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Animal1{} " + super.toString();
    }
}
