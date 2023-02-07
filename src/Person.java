import java.util.Objects;

public final class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		Objects.requireNonNull(name, "Name is null");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return getClass().getName() + ": Name: " + name + ", age: " + age;
	}

}
