package myTests;

import java.util.ArrayList;
import java.util.List;

public class TestClass2 {
    public static void main(String[] args) {
        int[] intArr = {2, 10, 3, 9};
        System.out.println(prettyArray(intArr));
    }

    public static boolean prettyArray(int[] intArr) {
        if (intArr != null && intArr.length > 0) {
            boolean result = true;
            List<Integer> numList = new ArrayList<>(); //Arrays.stream(intArr).boxed().toList();
            for (int i = 0; i < intArr.length ; i++) {
                numList.add(intArr[i]);
            }
            for (int i : numList) {
                if (!numList.contains(i + 1) && !numList.contains(i - 1)) {
                    return false;
                }
            }
            return result;
        } else return false;
    }
}