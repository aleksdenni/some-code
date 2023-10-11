package substring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubStringTest {

    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();

        int numOccurrences = countOccurrences1(str, sub);
        String indexesInputSub = indexesOccurrences(str, sub, numOccurrences);*/

//        System.out.println(numOccurrences);
//        System.out.println(indexesInputSub);
        for (int i = 0 , j = 2; i < 10 || j < 30; i++ , j+=5) {

        }


        System.out.println(filterLetter("kkkkgf"));


        //scanner.close();
    }

    public static int countOccurrences1(String str, String sub) {
        Pattern p = Pattern.compile(sub);
        Matcher m = p.matcher(str);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }

    public static String indexesOccurrences(String str, String sub, int numOccurrences) {
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

    public static String filterLetter(String input) {
        final String in = input.toUpperCase();
        return IntStream.range(0, in.length())
                .filter(i -> i % 2 == 0)
                .mapToObj(x -> Character.toString(in.charAt(x))
                        .toUpperCase())
                .collect(Collectors.joining(""));
        //String res = date.map(x -> Character.toString(x));


        /*if (input==null) return "data is not found";
        StringBuilder sb = new StringBuilder();
        if(input.length()>1){
            for (int i = 0; i < input.length(); i++) {
                if(i%2==0){
                    sb.append((char)input.codePointAt(i));
                }
            }
        }else return input.toUpperCase();
        return sb.toString().toUpperCase();*/

        /*AtomicInteger counter = new AtomicInteger(1);
        return Stream.of(input.split("")).map(x -> {
            if (counter.get() % 2 == 0 || counter.get() == 1) {
                x = x.toUpperCase();
            } else x = "";
            counter.getAndIncrement();
            return x;
        }).collect(Collectors.joining(""));*/


    }
}
//abracadabra
//azyxxzyzy