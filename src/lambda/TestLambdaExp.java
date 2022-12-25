package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class TestLambdaExp {
    //static Comparator<String> comparator = new StringLengthComparator();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Hello", "how", "are", "you?");

        Integer a = 5;
        String str = "hello World";
        str.chars().forEach((int x) -> System.out.print((char) (x * a >> 1)));

        System.out.println();
        Runnable run1 = () -> new TestLambdaExp().check();
        Runnable run2 = () -> System.out.println("hello2");
        new Thread(run1).start();
        new Thread(run2).start();

        Settable<Animal> st = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        Cat cat1 = new TestLambdaExp().new Cat();
        st.set(cat1, "chorniy", 15);
        System.out.println(cat1.getName() + " : " + cat1.getAge());

        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };*/

        /*Comparator<String> comparator = (String o1, String o2) -> {
            return o1.length() - o2.length();
        };*/

        //Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        /*Comparator<String> comparator = Comparator.comparingInt(String::length);
        Collections.sort(list, comparator);*/
        //list.forEach(System.out::println);

        list.stream()
                .sorted((o1, o2) -> o1.length() - o2.length()) // or .sorted(Comparator.comparingInt(String::length))
                //.sorted((o1, o2) -> o2.length() - o1.length()) // reverse sort
                .forEach(System.out::println);
    }

    public void check() {
        System.out.println("hello1");
    }

    /*static class StringLengthComparator implements Comparator<String>{
        public int compare (String obj1, String obj2) {
            return obj1.length() - obj2.length();
        }
    }*/

    interface Settable<T> {
        void set(T obj, String name, int age);
    }

    class Animal {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Cat extends Animal {

    }
}