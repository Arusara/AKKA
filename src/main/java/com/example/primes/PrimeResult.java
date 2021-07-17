package com.example.primes;

import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrimeResult {

    private SortedSet<BigInteger> result = new TreeSet<>();

    public SortedSet<BigInteger> getResult() {
        return result;
    }

    public void setResult(SortedSet<BigInteger> result) {
        this.result = result;
    }



    public void addPrimeIntger(BigInteger bigInteger) {

        synchronized (this) {
            result.add(bigInteger);
        }
    }


    public int getSizeOfResult() {
        synchronized (this) {
            return result.size();
        }
    }

    public void print(){
        synchronized (this) {
            result.forEach(System.out::println);
        }
    }
}
