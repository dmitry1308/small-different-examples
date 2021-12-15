package shchepin.examples.jenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("foo", "bar");
        // error: incompatible types
        List<Object> objects = Collections.singletonList(strings);


        List<? super Number> numbers =
                new ArrayList<Object>(Arrays.asList("foo", true, 8));

        numbers.add(3);
        numbers.add(3.2);

        Integer s = (Integer) numbers.get(0);
    }
}
