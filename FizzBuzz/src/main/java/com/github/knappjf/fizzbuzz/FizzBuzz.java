package com.github.knappjf.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int value) {
        String result = "";

        if (value % 3 == 0) {
            result += "Fizz";
        }

        if (value % 5 == 0) {
            result += "Buzz";
        }

        if (!result.isEmpty()) {
            return result;
        } else {
            return String.valueOf(value);
        }
    }
}
