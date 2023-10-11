package TestTask;

import java.util.List;

public class TastAlgo {
    public static void main(String[] args) {
        int i = result(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(i);
        System.out.println(fib(8));
    }

    static Integer result(List<Integer> arr) {
        return arr.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> a+b*2);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int start = 1;
        int next = 1;
        for (int i = 0; i < n - 2; i++) {
            int temp = next;
            next+=start;
            start = temp;
        }
        return next;
    }
}

// 1 1 2 3 5 8 13 21