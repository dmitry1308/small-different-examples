package shchepin.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.empty().forEach(System.out::println);

        Stream.of(1,5,105,9,34,2)
                .filter(integer -> integer>2)
                .map(integer -> integer+1)
                .sorted()
                .forEach(x->System.out.format("Число: %d;%n", x));

        List<Integer> list = Arrays.asList(5, 6, 7, 45, 2, 45, 12);
        Integer _min = list.stream().min(Integer::compareTo).get();
        System.out.println("min: " + _min);

        System.out.println();
        list.stream().sorted().forEach(x->System.out.format("Число: %d;%n", x));;
        System.out.println();

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x < 2)
                .forEach(System.out::println);


        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get();
        System.out.println("min: " + min);


        boolean result = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x -> x == 3);

        double average = IntStream.range(2, 16)
                .average()
                .getAsDouble();

        System.out.println("average: " + average);

        int sum = IntStream.of(2, 6, 7).sum();
    }
}
