package myTests;

import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args) {
        Node node = new Node(1,new Node(2, new Node(3)));

        /*MyTest4 test = new MyTest4();
        System.out.println(MyTest4.convertListToString(node));*/


        int[] checkArray = toArrayOfDigits(-456712);
        System.out.println(Arrays.toString(checkArray));
    }

    public static int[] toArrayOfDigits(int num) {
        String strNum = num +"";
        boolean check = false;
        if(strNum.contains("-")){
            strNum = strNum.replaceAll("-","");
            check = true;
        }
        StringBuilder sb = new StringBuilder("");
        String[] reverseNumbers = sb.append(strNum).reverse().toString().split("");
        int[] intArr = new int[reverseNumbers.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(reverseNumbers[i]);
        }
        if (check) intArr[intArr.length-1] = -intArr[intArr.length-1];
        return intArr;
    }
}
