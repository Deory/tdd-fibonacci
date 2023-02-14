package com.deory;

import org.junit.jupiter.api.Test;

import static com.deory.Fibonacci.fib;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFibonacci {
    
    @Test
    public void testFibonacci() {
        int[][] fibonacci = {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}};
        for (int[] fibonacciResult : fibonacci) {
            assertEquals(fib(fibonacciResult[0]), fibonacciResult[1]);
        }
    }
    
}
