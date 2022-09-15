package com.javainsider.javaprep.medium;

public class MakeValidParentheses {

    public static void main(String[] args) {
        String input1 = "())"; // Ans 1
        String input2 = ")))"; // Ans 3
        String input3 = "())))"; // Ans 3


        System.out.println(" Answer to input 1: "+ minAddToMakeValid(input1));
        System.out.println(" Answer to input 2: "+ minAddToMakeValid(input2));
        System.out.println(" Answer to input 3: "+ minAddToMakeValid(input3));
    }


    public static int minAddToMakeValid(String s) {
        int cnt =0, ans =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt += c == '(' ? 1 : -1;
            if (cnt == -1) {
                ans++;
                cnt++;
            }

        }

        return ans+cnt;
    }
}
