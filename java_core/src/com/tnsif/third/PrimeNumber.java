package com.tnsif.third;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = true;

        if (n <= 1) {            // 0 and 1 are not prime
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) { // check if n is divisible by i
                    isPrime = false;
                    break;       // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
