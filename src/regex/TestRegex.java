package regex;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String str = "My Phone number is out of range. This is Mark";
        str = str.replaceAll("^(\\w+)(.*)([ ]+)(\\w+)$", "$4$3$2$3$1");
//        System.out.println(str);
        Dimension test = new Dimension(0,0);
        test.height=0;
        test.width=2;
        try{
            int d = 3434;
        }finally {

        }

        List<Object> set = new ArrayList<>(Arrays.asList("hello", 1, 1, 2, 3));
        Collections.addAll(set, 1, 2, 3, 4, "22", 1, "2", "1");
        Set<Object> st = new HashSet<>();
        Collections.addAll(st, set.toString()
                .replaceAll("[\\[\\]]", "")
                .split(", "));
        st.forEach(System.out::println);
    }

    String uppercaseFirstLetter(String input){
        return Pattern.compile("^.").matcher(input).replaceFirst(m -> m.group().toUpperCase());
    }

}
