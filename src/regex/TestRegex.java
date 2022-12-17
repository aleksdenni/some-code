package regex;

import java.util.*;

public class TestRegex {
    public static void main(String[] args) {
        String str = "My Phone number is out of range. This is Mark";
        str = str.replaceAll("^(\\w+)(.*)([ ]+)(\\w+)$", "$4$3$2$3$1");
        System.out.println(str);

        List<Object> set = new ArrayList<>(Arrays.asList("hello", 1, 1, 2, 3));
        Collections.addAll(set, 1, 2, 3, 4, "22", 1, "2", "1");
        Set<Object> st = new HashSet<>();
        Collections.addAll(st, set.toString()
                .replaceAll("[\\[\\]]", "")
                .split(", "));
        st.forEach(System.out::println);
    }
}
