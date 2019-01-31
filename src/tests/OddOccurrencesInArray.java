package tests;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        // write your code in Java SE 8
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
