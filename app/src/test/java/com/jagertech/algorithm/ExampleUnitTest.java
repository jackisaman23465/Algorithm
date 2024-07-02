package com.jagertech.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void maxGoldAlgorithmTest() {
        int maxGoldPathSum = MaxGoldPathAlgorithm.start(new int[][]{
                {1, 0, 3},
                {4, 0, 6},
                {7, 0, 9}
        });
        assertEquals(18, maxGoldPathSum);
    }

    @Test
    public void imageSmootherAlgorithmTest() {
        int[][] testResult1 = ImageSmootherAlgorithm.start(new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        });
        assertArrayEquals(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        },testResult1);
        int[][] testResult2 = ImageSmootherAlgorithm.start(new int[][]{
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        });
        assertArrayEquals(new int[][]{
                {137, 141, 137},
                {141, 138, 141},
                {137, 141, 137}
        },testResult2);
    }

    @Test
    public void kthSmallestPrimeFractionAlgorithmTest() {
//        int[] testResult1 = KthSmallestPrimeFractionAlgorithm.start(new int[]{1,2,3,5},3);
//        assertArrayEquals(new int[]{2, 5},testResult1);
//        int[] testResult2 = KthSmallestPrimeFractionAlgorithm.start(new int[]{1,7},1);
//        assertArrayEquals(new int[]{1, 7},testResult2);
        int[] testResult3 = KthSmallestPrimeFractionAlgorithm.start(new int[]{1,2,3,5},5);
        assertArrayEquals(new int[]{3, 5},testResult3);
    }

    @Test
    public void evaluateTreeAlgorithmTest() {

    }
}