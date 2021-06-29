package shchepin.examples.mapAndFlatMap;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.stream().map(s -> s.equals("2") ? "5" : 1).findFirst().get();
    }
}

