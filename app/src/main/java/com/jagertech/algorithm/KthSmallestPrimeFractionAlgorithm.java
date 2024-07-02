package com.jagertech.algorithm;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestPrimeFractionAlgorithm {
    static public int[] start(int[] arr, int k) {
        int n = arr.length;
        float left = 0;
        float right = 1;
        float mid = 0;
        int num = 0,den = 0;
        int[] result = new int[2];
        while (left <= right) {
            mid = (left + right) / 2;
            int j = 1, total = 0;
            double maxFrac = 0;
            for (int i = 0; i < n; ++i) {
                while (j < n && arr[i] >= arr[j] * mid) {
                    ++j;
                }

                total += n - j;

                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
                    maxFrac = arr[i] * 1.0 / arr[j];
                    num = i;
                    den = j;
                }
            }

            if (total == k) {
                result[0] = arr[num];
                result[1] = arr[den];
                break;
            }

            if (total > k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return result;
    }
}
