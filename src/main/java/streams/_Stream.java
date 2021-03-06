package streams;

import java.util.List;
import java.util.function.Predicate;



import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        //"abstraction mode" stream API
        people.stream()
                .map(person -> person.name)//convert into a name list
                .mapToInt(String::length)//convert into a name length list
                .forEach(System.out::println);//print each name length in the map list

        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);
        boolean containsOnlyFemale = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemale);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }


}
