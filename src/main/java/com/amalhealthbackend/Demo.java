package com.amalhealthbackend;

import java.util.regex.Pattern;

public class Demo {
public static void main(String[] args) {
      String input1 = "+12345";
        String input2 = "67890";
        String input3 = "+1f23";  // This should not match.

        String regex = "^[+]?\\d+$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println(pattern.matcher(input1).matches());  // true
        System.out.println(pattern.matcher(input2).matches());  // true
        System.out.println(pattern.matcher(input3).matches());  // false
}
}
