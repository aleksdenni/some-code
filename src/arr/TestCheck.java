package arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCheck extends TestArr {


    public static void main(String[] args) {
        new Thread();
        new Thread();
        List<String> str1 = new ArrayList(List.of("1", "1"));
        Set<String> str2 = new HashSet<>(List.of("1", "1"));

        System.out.println(str1);
    }

    private void s1(int i, int a) {
    }

    public void s1(int i) {
    }

    public void someMethod(int... arr) {
    }
}
