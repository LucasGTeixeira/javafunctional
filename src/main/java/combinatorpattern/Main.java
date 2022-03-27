package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                "Alic@gmail.com",
                "+0251514521",
                LocalDate.of(2000, 2, 21)
        );

        CustumerValidatorService validatorService = new CustumerValidatorService();
        System.out.println(validatorService.isValid(customer));

    }
}
