package shchepin.examples.extendss;

public class AbstractAnimal {
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" + "name='" + name + '\'' + '}';
    }
}
