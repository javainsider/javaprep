package com.javainsider.javaprep.simple;
/*
A palindrome, and its reverse, are identical to each other.

Algorithm:
We'll reverse the given string and compare it with the original. If those are equivalent, it's a palindrome.
Since only alphanumeric characters are considered, we'll filter out all other types of characters before we apply our algorithm.
Additionally, because we're treating letters as case-insensitive, we'll convert the remaining letters to lower case. The digits will be left the same.

 */

public class Palindrome {

    public static void main(String[] args) {

        String test1 = "we11aBcdcba11eW";
        System.out.println("test1 ---->>> should be a palindrome : " + isPalindrome(test1));
        String test2 = "we11aBcdcba11eWooooo";
        System.out.println("test2 ---->>> should not be a palindrome : " + isPalindrome(test2));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    /**
     * An alternate solution using Java 8 Streams
     */
    public static boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }
}
