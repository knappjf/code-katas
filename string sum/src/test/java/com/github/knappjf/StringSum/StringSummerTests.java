package com.github.knappjf.StringSum;

import com.github.knappjf.stringsum.StringSummer;
import org.junit.Assert;
import org.junit.Test;

public class StringSummerTests {
    @Test
    public void testSum_emptyStringInput_returnsZero() {
        StringSummer summer = new StringSummer();
        int result = summer.sum("", "");

        Assert.assertEquals(0, result);
    }

    @Test
    public void testSum_naturalNumberInput_returnsSum() {
        StringSummer summer = new StringSummer();

        Assert.assertEquals(3, summer.sum("1", "2"));
    }

    @Test
    public void testSum_invalidNumber_returnsSum() {
        StringSummer summer = new StringSummer();

        Assert.assertEquals(1, summer.sum("1", "asdf"));
    }
}
