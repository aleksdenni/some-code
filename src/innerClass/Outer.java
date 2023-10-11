package innerClass;

import java.util.Arrays;

public class Outer {
    public static void main(String[] args) {
        int i = -5;
        int[]arr ={1,2,3,4,5};
        changeArr(i);
        System.out.println(-i);
    }

    static void changeArr(int array ){
        array = 0;
    }
}
