package shchepin.examples.streams.groupStudents;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
				new Student("Alex", "Physics"),
				new Student("Rika", "Biology"),
				new Student("Julia", "Biology"),
				new Student("Steve", "History"),
				new Student("Mike", "Finance"),
				new Student("Hinata", "Biology"));


		students.stream()
				.collect(Collectors.groupingBy(Student::getThing))
				.entrySet().forEach(System.out::println);

		students.stream()
				.collect(Collectors.groupingBy(
						Student::getThing, Collectors.counting()))
				.forEach((s, count) -> System.out.println(s + ": " + count));

		 

	}
}
