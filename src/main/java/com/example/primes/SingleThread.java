package com.example.primes;

import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SingleThread {



    public static void main(String arg[]) {

        SortedSet<BigInteger> sortedSet = new TreeSet<>();

        Long start = System.currentTimeMillis();

        while(sortedSet.size() < 20) {
            System.out.println("counter "+sortedSet.size());
            BigInteger bigInteger = new BigInteger(2000, new Random());
            sortedSet.add(bigInteger.nextProbablePrime());
        }

        Long end = System.currentTimeMillis();

        System.out.println("The time taken is: "+ (end - start)+ " ms" );


    }

}
