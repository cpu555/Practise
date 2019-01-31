package tests;

public class BinaryGap {
    public static int solution(int N) {
        String binaryString =Integer.toBinaryString(N);
        int count=0;
        int binaryGap= 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i)=='0')
                count++;
            else {
                if (binaryGap<=count)
                    binaryGap=count;
                count =0;
            }
        }
        return binaryGap;
    }

    public static void main(String[] args) {
        int N=1045;
        System.out.println(solution(N));

    }
}
