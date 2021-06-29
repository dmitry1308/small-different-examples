package shchepin.examples.regularExpression;

public class Main {
    public static void main(String[] args) {
        String nummerPlatz = "02-SAP-TL01";
        int pos = nummerPlatz.lastIndexOf("-");
        System.out.println("last index = " + pos);

        String afterWork = nummerPlatz.substring(pos + 1);
        System.out.println("lafterWork = " + afterWork);

        String numberOnly= afterWork.replaceAll("[^0-9]", "");
        int numberOnlyInt = Integer.parseInt(numberOnly);
        System.out.println("numberOnly = " +numberOnlyInt);

        String name = Main.class.getPackage().getName();
        System.out.println(name
        );
    }
}
