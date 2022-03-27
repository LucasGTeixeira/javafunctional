package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        greetCustomerAndShowNumber(maria, true);
        greetCustomerAndShowNumber(maria, false);
        greetCustomerConsumer.accept(maria);
        greetCustomerBiConsumer.accept(maria, true);
        greetCustomerBiConsumer.accept(maria, false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello, " + customer.customerName +
                ". Thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static void greetCustomerAndShowNumber(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello, " + customer.customerName +
                ". Thanks for registering phone number " +
                //ternary if
                (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
    }

    //Receive one argument and returns nothing
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello, " + customer.customerName +
                    ". Thanks for registering phone number " +
                    customer.customerPhoneNumber);

    //Receive two arguments and return nothing
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello, " + customer.customerName +
            ". Thanks for registering phone number " +
            //ternary if
            (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerNumber;
        }
    }
}
