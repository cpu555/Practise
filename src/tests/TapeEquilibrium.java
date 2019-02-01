/*
 * Copyright (c) 2019 by Morhaf Kourbaj.
 */

package tests;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        int m = Integer.MAX_VALUE;
        int sum =0;
        int prev = 0;
        for (int i = 0; i < A.length; i++)
            sum += A[i];

        int next;
        for (int p = 1; p < A.length; p++) {
            prev += A[p - 1];
            next = sum - prev;
            m = Math.min(m, Math.abs(prev - next));
        }
        return m;
    }

    public static void main(String[] args) {

        int [] A= {3,1,2,4,3};
        System.out.println(solution(A));

    }
}
