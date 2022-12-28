package substring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();

        int numOccurrences = countOccurrences1(str, sub);
        String indexesInputSub = indexesOccurrences(str, sub, numOccurrences);

        System.out.println(numOccurrences);
        System.out.println(indexesInputSub);
    }

    public static int countOccurrences1(String str, String sub){
        Pattern p = Pattern.compile(sub);
        Matcher m = p.matcher(str);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }

    public static String indexesOccurrences(String str, String sub, int numOccurrences){
        StringBuilder result = new StringBuilder();
        int lastIndex = sub.length();
        for (int i = 0; i < numOccurrences; i++) {
            if (i == 0) {
                result.append(str.indexOf(sub) + 1);
            } else {
                result.append(" ").append(str.indexOf(sub, lastIndex) + 1);
                lastIndex = str.indexOf(sub, lastIndex) + 1;
            }
        }
        return result.toString();
    }
}
//abracadabra
//azyxxzyzy