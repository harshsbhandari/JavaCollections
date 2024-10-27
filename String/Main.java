package String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "hello_world";

//        1. Size of string
        int n = s.length();
        System.out.println("Size of string - " + n);

//        2. Print each character of string
        for (int i = 0; i < n; i++)
            System.out.print(s.charAt(i));
        System.out.println();

//        3. Check if string is empty
        if (s.isEmpty())
            System.out.println("String is empty");

//        4. Check is string is blank (If it only contains white spaces)
        if (s.isBlank())
            System.out.println("String is blank");

//        5. Create a substring
        System.out.println(s.substring(0, 4));

//        6. Sort a string
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String sortedString = new String(charArr);
        System.out.println("Sorted string - " + sortedString);

//        7. Reverse a string
        StringBuilder stringBuilder = new StringBuilder(sortedString);
        stringBuilder.reverse();
        System.out.print("Reversed string - " + stringBuilder);
    }
}
