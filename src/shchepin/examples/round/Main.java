package shchepin.examples.round;

public class Main {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 6;

        double v = n1/n2;
        int anz = (int) Math.round(v);
        System.out.println(v);
        System.out.println(anz);

        String s = "6d546";
        boolean matches = s.matches("[-+]?\\d+");
        System.out.println(matches);


    }
}
