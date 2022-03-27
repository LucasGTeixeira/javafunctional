package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function that takes one argument and return one result
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        System.out.println(addByOneAndThenMultiplyBy10.apply(4));

        //BiFunction that takes two arguments and return one result

        System.out.println(incrementByOneAndMultiply(4, 100));

        Integer incrementAndMultiply = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(incrementAndMultiply);


    }

    //Functions
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    //BiFunctions
    static Function<Integer, Integer> addByOneAndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multiplyBy10Function);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    //Normal java Functions
    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
