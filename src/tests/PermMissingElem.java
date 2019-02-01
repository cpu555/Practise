/*
 * Copyright (c) 2019 by Morhaf Kourbaj.
 */

package tests;

import java.util.Arrays;

public class PermMissingElem {

    public static int solution(int[] A) {
        int m=1;
        boolean here = false;
        Arrays.sort(A);
        while (!here){
            if (Arrays.binarySearch(A, m)<0)
                here=true;
            else
                m++;
        }
        return m;
    }

    public static void main(String[] args) {
        int [] A = {2,3,1,5};
        System.out.println(solution(A));
    }
}
