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
        int maxGoldPathSum = MaxGoldPathAlgorithm.getMaximumGold(new int[][]{
                {1, 0, 3},
                {4, 0, 6},
                {7, 0, 9}
        });
        assertEquals(18, maxGoldPathSum);
    }
}