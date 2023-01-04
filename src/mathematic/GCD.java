package mathematic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
НCД
*/

public class GCD {
    public static void main(String[] args) throws Exception {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String numF = reader.readLine();
            long numFirst = Long.parseLong(numF);
            String numS = reader.readLine();
            long numSecond = Long.parseLong(numS);

            if (numFirst <= 0 || numSecond <= 0) {
                throw new NumberFormatException();
            } else
                while (numFirst != numSecond) {
                    if (numFirst > numSecond) {
                        numFirst = numFirst - numSecond;
                    } else numSecond = numSecond - numFirst;
                }

            System.out.println(BigInteger.valueOf(Long.parseLong(numF))
                    .gcd(BigInteger.valueOf(Long.parseLong(numS))));

        } catch (NumberFormatException e) {
            System.out.println("Введіть цілі числа більше нуля");
            main(new String[]{});
        }
    }
}
