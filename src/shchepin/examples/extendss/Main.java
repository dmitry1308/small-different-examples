package shchepin.examples.extendss;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal");
        Animal1 animal1 = new Animal1("animal1");
        Animal animalNew = new Animal("animalNew");


        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal.getName());
        System.out.println(animalNew.getName());
    }
}
