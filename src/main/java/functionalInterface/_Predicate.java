package functionalInterface;

import java.time.Period;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {


        System.out.println("Normal Function");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000125463"));

        System.out.println("Using Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000125463"));

        System.out.println("Using more than one predicate at once");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07000340000"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3Predicate).test("07000000000"));

        System.out.println("Using more than one predicate at once in a BiPredicate Function");
        System.out.println(areThoseVerifiedNumbers.test("07000000000", "07005800023"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //Receive one argument and return a boolean
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3Predicate = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, String> areThoseVerifiedNumbers = (phoneNumber1, phoneNumber2) ->
        isPhoneNumberValidPredicate.test(phoneNumber1) && isPhoneNumberValidPredicate.test(phoneNumber2);

}
