package optionals;

import java.util.Arrays;
import java.util.Optional;

public class Optional_Example {

    public static Optional<Integer> findElement(Integer[] arr, int x){
        return Arrays.stream(arr).filter(number -> number == x).findFirst();
    }

    public static void main(String[] args) {
        findElement(new Integer[]{1, 2, 3, 4, 5}, 3).ifPresentOrElse(System.out::println, () -> System.out.println("Number not found"));
        findElement(new Integer[]{1, 2, 3, 4, 5}, 9).ifPresentOrElse(System.out::println, () -> System.out.println("Number not found"));
    }
}
