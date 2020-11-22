package by.jrr.lesson.hashMap;

import java.util.Objects;

public class PersonKey {
    private String name;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonKey personKey = (PersonKey) o;
        return Objects.equals(name, personKey.name) &&
                Objects.equals(lastName, personKey.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    public PersonKey(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonKey{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
