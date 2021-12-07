package optonal;

import java.util.Optional;

public class Person {

    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {

        Person person = new Person("Сергей", null);
        Person person1 = new Person("Сергей", "pochta@gmail.com");

        System.out.println(person
                .getEmail()
                .map(String::toUpperCase)
                .orElse("у " + person.getName() + " нет почтового ящика"));
    }

}