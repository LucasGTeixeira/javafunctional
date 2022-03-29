package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //Optional.empty().ifPresentOrElse(Consumer, Runnable/Supplier??)
        Optional.empty()
                .ifPresentOrElse(email ->
                        System.out.println("sending e-mail to " + email),
                        () ->
                            System.out.println("Cannot send e-mail")
                        );

    }
}
