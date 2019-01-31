/*
 * Copyright (c) 2019 by Morhaf Kourbaj.
 */

package tests;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        if (X==Y)
            return 0;
        else
            return (int) Math.ceil((double)(Y-X)/D);
    }
    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }
}
