package com.example.primes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class MultiThread implements Runnable {

    PrimeResult primeResult;
    @Override
    public void run() {
        BigInteger bigInteger = new BigInteger(100, new Random());
        primeResult.addPrimeIntger(bigInteger.nextProbablePrime());
    }


    public MultiThread(PrimeResult result) {
        primeResult = result;
    }

    public static void main(String arg[]) throws InterruptedException {
        long start = System.currentTimeMillis();
        PrimeResult primeResult = new PrimeResult();
        Runnable multiThread = new MultiThread(primeResult);

        Runnable status = new CurrentStatus(primeResult);
        Thread statusThread = new Thread(status);
        statusThread.start();

        List<Thread> threads = new ArrayList<>();

        for (int i=0;i<100;i++) {
            Thread thread = new Thread(multiThread);
            threads.add(thread);
            thread.start();
        }


        for(Thread thread : threads) {
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("the time taken is : "+(end-start) + "ms");
       // System.out.println(primeResult.getResult());


    }

}
