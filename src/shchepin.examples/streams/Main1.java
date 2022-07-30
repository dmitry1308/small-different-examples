package shchepin.examples.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main1 {
	public static void main(String[] args) {
		Stream.empty().forEach(System.out::println);

		Stream.of(1, 5, 105, 9, 34, 2)
				.filter(integer -> integer > 2)
				.map(integer -> integer + 1)
				.sorted()
				.forEach(x -> System.out.format("Число: %d;%n", x));

		List<Integer> list = Arrays.asList(5, 6, 7, 45, 2, 45, 12);
		Integer _min = list.stream().min(Integer::compareTo).get();
		System.out.println("min: " + _min);

		System.out.println();
		list.stream().sorted().forEach(x -> System.out.format("Число: %d;%n", x));
		;
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

		Stream<Integer> integerStream = Stream.of(5, 6, 9, 8, 9, 6, 5).filter(n -> n > 7);
		//System.out.println("/n"+"integer: " + objects);


		Stream.of("3", "4", "5")
				.map(Integer::parseInt)
				.map(x -> x + 10)
				.forEach(System.out::println);


		List<Integer> list1 = Stream.of(1, 2, 3)
				.collect(Collectors.toList());
		System.out.println(list1);

		String[] elements = Stream.of("a", "b", "c", "d")
				.toArray(String[]::new);


		boolean result1 = Stream.of(1, 2, 3, 4, 5,9)
				.allMatch(x -> x <= 7);

		boolean result2 = Stream.of(1, 2, 3, 4, 5)
				.anyMatch(x -> x <= 7);

		double result3 = IntStream.range(2, 16)
				.average()
				.getAsDouble();


		List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.toList());

		Map<Integer, String> map2 = Stream.of(1, 2, 3)
				.collect(Collectors.toMap(
						Function.identity(),
						i -> String.format("%d * 2 = %d", i, i * 2)
				));


		String s2 = Stream.of("a", "b", "c", "d")
				.collect(Collectors.joining("-"));
		System.out.println(s2);

		Integer sum1 = Stream.of("1", "2", "3", "4")
				.collect(Collectors.summingInt(Integer::parseInt));


		Long count = Stream.of("1", "2", "3", "4")
				.collect(Collectors.counting());


		Optional<String> min4 = Stream.of("ab", "c", "defgh", "ijk", "l")
				.collect(Collectors.minBy(Comparator.comparing(String::length)));
		min4.ifPresent(System.out::println);


		Map<Integer, List<String>> map1 = Stream.of(
				"ab", "c", "def", "gh", "ijk", "l", "mnop")
				.collect(Collectors.groupingBy(String::length));
		map1.entrySet().forEach(System.out::println);


		Map<Integer, String> map3 = Stream.of(
				"ab", "c", "def", "gh", "ijk", "l", "mnop")
				.collect(Collectors.groupingBy(
						String::length,
						Collectors.mapping(
								String::toUpperCase,
								Collectors.joining())
				));
		map3.entrySet().forEach(System.out::println);


		Map<Boolean, List<String>> map4 = Stream.of(
				"ab", "c", "def", "gh", "ijk", "l", "mnop")
				.collect(Collectors.partitioningBy(s -> s.length() <= 2));
		map4.entrySet().forEach(System.out::println);

		Stream.of(1, 2, 3, 1, 9, 2, 5, 3, 4, 8, 2)
				.collect(Collectors.collectingAndThen(
						Collectors.toCollection(LinkedHashSet::new),
						ArrayList::new));

		list.stream()
				.filter(x -> x > 2)
				.forEach(System.out::println);


		
		

	}
}
