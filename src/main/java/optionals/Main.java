package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable(null)
                .ifPresentOrElse(email ->
                        System.out.println("sending e-mail to " + email),
                        () ->
                            System.out.println("Cannot send e-mail")
                        );

    }
}
