package com.github.knappjf.stringsum;

public class StringSummer {
    public int sum(String num1, String num2) {
        int formattedNum1 = 0;
        int formattedNum2 = 0;

        try {
            formattedNum1 = Integer.parseInt(num1);
            formattedNum2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        return formattedNum1 + formattedNum2;
    }
}
