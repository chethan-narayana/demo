package com.example.demo.forkjoinpool;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class ParallelDemo {

    public static void main(String[] args) {


        Instant before = Instant.now();
        int total = IntStream.of(4,3,4,5,6,4)
                .parallel()
                .map(ParallelDemo::doubleIt)
                .sum();


        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        System.out.println("Total of doubles " + total);
        System.out.println("Time =" + duration.toMillis() + "ms");

    }

    private static int doubleIt(int number) {
      try{
    Thread.sleep(100);
          System.out.println(Thread.currentThread().getName() + " with number = " + number);
      } catch (InterruptedException e) {

      }
        return number * 2;
    }
}
