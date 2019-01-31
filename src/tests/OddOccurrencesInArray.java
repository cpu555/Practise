/*
 * Copyright (c) 2019 by Morhaf Kourbaj.
 */

package tests;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {

        int e = 0;

        for (int i = 0; i < A.length; i++) {
            e ^= A[i];
        }
        return e;
    }

    public static void main(String[] args) {
        int  [] A  = {9,3,9,0,9,7,0,3,9};
        System.out.println(solution(A));

    }
}
