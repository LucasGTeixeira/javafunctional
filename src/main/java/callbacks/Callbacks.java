package callbacks;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("john", null, value -> System.out.println("Last name not provided for "+ value));

        helloWithRunnable("Jane", null, () -> System.out.println("Last name not provided"));
    }

//    similar javaScript application:
//        function hello(firstName, lastName, callback) {
//        console.log(firstName);
//        if (lastName) {
//            console.log(lastName)
//        } else {
//            callback();
//        }
//    }

    static void hello(String fistName, String lastName, Consumer<String> callback) {
        System.out.println(fistName);
        if (lastName != null){
            System.out.println(lastName);
        }
        else {
            callback.accept(fistName);
        }
    }

    static void helloWithRunnable(String fistName, String lastName, Runnable callback) {
        System.out.println(fistName);
        if (lastName != null){
            System.out.println(lastName);
        }
        else {
            callback.run();
        }
    }


}
