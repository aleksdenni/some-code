package mathematic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal bigD = new BigDecimal(1);
        if (n < 0) return "0";
        for (int i = 1; i <= n; i++) {
            bigD = bigD.multiply(new BigDecimal(i));
        }
        return String.valueOf(bigD);
    }

    int fact ( int n ) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
