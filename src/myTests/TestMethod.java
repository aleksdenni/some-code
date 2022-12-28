package myTests;

import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args) {

        int[] checkArray = toArrayOfDigits(456712);
        System.out.println(Arrays.toString(checkArray));
    }

    public static int[] toArrayOfDigits(int num) {
        StringBuilder sb = new StringBuilder("");
        String[] reverseNumAsStringArr = sb.append(num).reverse().toString().split("");
        int[] reverseNumAsIntArr = new int[reverseNumAsStringArr.length];
        for (int i = 0; i < reverseNumAsStringArr.length; i++) {
            reverseNumAsIntArr[i] = Integer.parseInt(reverseNumAsStringArr[i]);
        }
        return reverseNumAsIntArr;
    }
}
