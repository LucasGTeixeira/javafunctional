package lambdas;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        //primitives cannot be null, just Objects
        Integer number = null;
        int number2 = 0;

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            int counter = 0;
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", null));

    }
}
