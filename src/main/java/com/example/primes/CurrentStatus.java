package com.example.primes;

public class CurrentStatus implements Runnable{

    PrimeResult result;
    CurrentStatus(PrimeResult result) {
        this.result = result;
    }

    @Override
    public void run() {
        while (result.getSizeOfResult()<100) {
            System.out.println(" size till now: "+result.getSizeOfResult());
            result.print();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
