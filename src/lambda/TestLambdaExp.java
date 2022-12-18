package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLambdaExp {
    static Comparator<String> comparator = new StringLengthComparator();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Hello", "how", "are", "you?");
        Collections.sort(list, comparator);
        list.forEach(System.out::println);
    }

    static class StringLengthComparator implements Comparator<String>
    {
        public int compare (String obj1, String obj2) {
            return obj1.length() - obj2.length();
        }
    }
}
