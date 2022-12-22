package week11;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.trim().isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name. Name must not be null, empty, or longer than 40 characters.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age. Age must be between 0 and 120.");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
    	return name + age;
    }
}
