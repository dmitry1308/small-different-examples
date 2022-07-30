package shchepin.examples.streams.groupStudents;

public class Student {
	private String name;
	private String thing;


	public String getThing() {
		return thing;
	}

	public void setThing(String thing) {
		this.thing = thing;
	}


	public Student(String name, String thing) {
		this.name = name;
		this.thing = thing;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", thing='" + thing + '\'' +
				'}';
	}
}
