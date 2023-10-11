package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class TestRun {

    private static final Map<Integer, String> NAMES = Map.of(1, "one", 2, "two", 3, "three");
    public static void main(String[] args) {
        List<AnonClass> ac = new ArrayList<>(List.of(
                                  new AnonClass(23, "myName"),
                                  new AnonClass(33, "my"),
                                  new AnonClass(30, "Name"),
                                  new AnonClass(27, "myName2") ));
        ac.stream().filter(anon -> anon.getAge()>25)
                .map(AnonClass::getName)
                .sorted((o1, o2) -> o2.length()-o1.length())
                .forEach(System.out::println);
        List<String> vowels = List.of("п", "р", "и", "в", "і", "т");

        Consumer<String> cons = A::new;

// sequential stream - nothing to combine
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());

// parallel stream - combiner is combining partial results
        StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result1.toString());
    }

    static class A{
        private String str;
        public A(String s) {
            str=s;
        }
    }
}