package com.github.knappjf.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {
    @Test
    public void testFizzBuzz_valueIsMultipleOfThree_returnsFizz() {
        String result = FizzBuzz.fizzBuzz(9);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void testFizzBuzz_valueIsMultipleOfFive_returnsBuzz() {
        String result = FizzBuzz.fizzBuzz(10);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzz_valueIsMultipleOfThreeAndFive_returnsFizzBuzz() {
        String result = FizzBuzz.fizzBuzz(30);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void testFizzBuzz_valueIsNotMultiple_returnsValue() {
        String result = FizzBuzz.fizzBuzz(7);
        Assert.assertEquals("7", result);
    }
}
