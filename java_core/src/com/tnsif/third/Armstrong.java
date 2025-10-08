package com.tnsif.third;
public class Armstrong {
    public static void main(String[] args) {
        int n = 153;        
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;          
            sum += digit * digit * digit;   
            temp /= 10;                     
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
