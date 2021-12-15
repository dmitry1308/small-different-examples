package shchepin.examples.strings.replace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String externalId = "ОП1";

        String index  = String.valueOf(externalId.replaceAll("[0-9]", ""));
        int    number = Integer.parseInt(externalId.replaceAll("[^0-9]", ""));
        String format = String.format("%s-%d", index, number);
        System.out.println(format);

        List<String> strings = new ArrayList<>();
        strings.add( "3");
        strings.add( 0,"1");
        strings.add( 1,"2");
        System.out.println(strings.toString());
    }
}
