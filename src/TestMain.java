import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TestMain {
    public static void main(String[] args) {
        String[] strArr = {"арка", "жарка", "варка", "1", "2", "11"};
        List<String> st = new ArrayList<>(new ArrayList<>(List.of(check())));
        st.add("12");
        System.out.println(st);
        for (var o : new TreeSet<>(new ArrayList<>(List.of(strArr)))) {
            System.out.println(o);
        }
        Box<Integer> num = new Box<>();
        Box<String> str = new Box<>();
        List<Character> ch = new ArrayList<>();
        num.set(23);
        str.set("22");
        ch.add('A');
        ch.add('B');
        System.out.println(num.get()+"\n"+str.get());
        ch.forEach(System.out::println);
        //fill(num, 12);
        //fill(str, "12");
        fill(ch, '1');
        ch.forEach(System.out::println);

    }
    public static String[] check() {
        return new String[]{"1", "2"};
    }

    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }
}

class Box<I>{
        private I r;
        private final int size = 1;

    void set(I o){
        r = o;
    }

    public I get() {
        return r;
    }

    public int size(){
        return size;
    }
}
