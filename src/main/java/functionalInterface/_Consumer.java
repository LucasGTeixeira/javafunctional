package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Custumer maria = new Custumer("Maria", "99999");
        greetCustumer(maria);
        greetCustumerAndShowNumber(maria, true);
        greetCustumerAndShowNumber(maria, false);
        greetCustumerConsumer.accept(maria);
        greetCustumerBiConsumer.accept(maria, true);
        greetCustumerBiConsumer.accept(maria, false);
    }

    static void greetCustumer(Custumer custumer){
        System.out.println("Hello, " + custumer.custumerName +
                ". Thanks for registering phone number " +
                custumer.custumerPhoneNumber);
    }

    static void greetCustumerAndShowNumber(Custumer custumer, boolean showPhoneNumber){
        System.out.println("Hello, " + custumer.custumerName +
                ". Thanks for registering phone number " +
                //ternary if
                (showPhoneNumber ? custumer.custumerPhoneNumber : "*****"));
    }

    //Receive one argument and returns nothing
    static Consumer<Custumer> greetCustumerConsumer = custumer ->
            System.out.println("Hello, " + custumer.custumerName +
                    ". Thanks for registering phone number " +
                    custumer.custumerPhoneNumber);

    //Receive two arguments and return nothing
    static BiConsumer<Custumer, Boolean> greetCustumerBiConsumer = (custumer, showPhoneNumber) ->
            System.out.println("Hello, " + custumer.custumerName +
            ". Thanks for registering phone number " +
            //ternary if
            (showPhoneNumber ? custumer.custumerPhoneNumber : "*****"));

    static class Custumer{
        private final String custumerName;
        private final String custumerPhoneNumber;

        public Custumer(String custumerName, String custumerNumber) {
            this.custumerName = custumerName;
            this.custumerPhoneNumber = custumerNumber;
        }
    }
}
