import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TestMain {
    public static void main(String[] args) {
        String[] strArr = {"арка", "жарка", "варка", "1", "2", "11"};
        List<String> st = new ArrayList<>(new ArrayList<>(List.of("1", "2", "3")));
        List<String> strings = new ArrayList<>(List.of("1", "2", "3"));
        List<String> strs = Arrays.asList("1", "2", "3");
        strings.add("33");
        System.out.println(st);
        for (var o : new TreeSet<>(new ArrayList<>(List.of(strArr)))) {
            System.out.println(o);
        }
    }

    public String[] check() {
        return new String[]{"1", "2"};
    }


}
