package com.tnsif.third;
public class Palindrome {
    public static void main(String[] args) {
        int n = 121;          // change this to test any number
        int temp = n;
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;          // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            temp /= 10;                     // remove last digit
        }

        if (reversed == n) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}
