package com.example.primes;

import java.math.BigInteger;
import java.util.Random;

public class SingleThread {



    public static void main(String arg[]) {
        BigInteger bigInteger = new BigInteger(4000, new Random());
        System.out.println("Intial big integer value: "+bigInteger);
        System.out.println("The next probable prime value: "+bigInteger.nextProbablePrime());

    }

}
