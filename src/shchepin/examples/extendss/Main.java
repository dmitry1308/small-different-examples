package shchepin.examples.extendss;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal");
        changeName(animal);
        System.out.println(animal);

 /*       Animal1 animal1 = new Animal1("animal1");
        Animal animalNew = new Animal("animalNew");


        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal.getName());
        System.out.println(animalNew.getName());


        BigDecimal bigDecimal = new BigDecimal(3.0);
        bigDecimal.add(new BigDecimal(1.0));
        bigDecimal.add(new BigDecimal(1.0));
        bigDecimal.add(new BigDecimal(1.0));

        System.out.println(bigDecimal);


        String s = "03-FOO-R01-02-A-02-P1";

        String s5 = "03-FOO-R22-02-A-02-P1";
        String r = s.substring(8,10);
        String s4 = s5.substring(8,10);
        System.out.println(r);
        System.out.println(Integer.parseInt(r));
        System.out.println(Integer.parseInt(s4));*/
    }

    private static void changeName(Animal animal) {
        animal.setName("change");
    }
}
