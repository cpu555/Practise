package tests;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        if (A.length>0)
            for (int i = 0; i < K; i++) {
                int l = A[A.length-1];
                int t =A[0];
                int t1=0;
                for (int j = 1; j <A.length ; j++) {
                    t1=A[j];
                    A[j]=t;
                    t=t1;
                }
                A[0]=l;
            }
        return A;
    }

    public static void main(String[] args) {
        int [] A = {3,8,9,7,6};
        solution(A,1).toString();
    }
}
