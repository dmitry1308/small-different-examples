package shchepin.examples.enums;

public class Main {
    public static void main(String[] args) {
        ColorEnumClass colorEnumClass = new ColorEnumClass("123",1);
        String name = colorEnumClass.name();
        System.out.println(name);
        Color red = Color.valueOf("RED");
        System.out.println(red);
        Color red1 = Color.WHITE;

    }
}
