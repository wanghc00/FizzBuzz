package com.thoughtworks;

public class FizzBuzz {
    public String say(int num) {
        String result = "";
        if (String.valueOf(num).contains("7")) {
            if (String.valueOf(num).contains("5")) {
                if (num % 3 == 0) {
                    result += "Fizz";
                }
                if (num % 7 == 0) {
                    result += "Whizz";
                }
                if (result.equals("")) {
                    result = String.valueOf(num);
                }
                return result;
            }
        }
        if (String.valueOf(num).contains("3") & !String.valueOf(num).contains("5")) {
            return "Fizz";
        }
        if (num % 3 == 0) {
            result += "Fizz";
        }
            if (num % 5 == 0) {
                result += "Buzz";
            }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if ("".equals(result)) {
            result = String.valueOf(num);
        }
        return result;
    }
}
