package myTests;

import java.util.Arrays;

public class TestClass3 {
    public static void main(String[] args) {
        int[][] arr1 = {{123},{456},{789}};
        int[][] arr2 = {{123},{456},{789}};
        int[][] arrSum = new int[arr1.length][];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println();
    }
}
