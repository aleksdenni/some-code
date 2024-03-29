package lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lambda.TestEnum.*;

public class TestLambdaExp {
    //static Comparator<String> comparator = new StringLengthComparator();

    public static void main(String[] args) {
        System.out.println(AnonClass);


        String str = "assdfgh";
        List<String> strList = Stream.of(str.toCharArray())
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.toList());


        System.out.println(strList);

/*        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Hello", "how", "are", "you?");*/
/*
*//**
 *
 *//*
        String[] arr = {"2", "3", "4", "6", "3", "2", "11", "8", "9"};
        List<String> arrList = new ArrayList<>(List.of(arr));
        arrList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Comparator<String> parserDesc = (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1);
        Comparator<String> parserAsc = (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2);

        arrList.sort(parserDesc);
        System.out.println(arrList);
*//**
 *
 *//*
        Confirmable check = num -> num % 2 == 0;
        //arrList.stream().filter(x -> check.isConfirmed(Integer.parseInt(x))).forEach(System.out::print);
        System.out.print("even numbers ");
        arrList.forEach((x) -> {
            if (check.isConfirmed(Integer.parseInt(x))) {
                System.out.print(x);
            }
        });
        System.out.println();
*//**
 *
 *//*
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

        *//*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };*//*

        *//*Comparator<String> comparator = (String o1, String o2) -> {
            return o1.length() - o2.length();
        };*//*

        //Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        *//*Comparator<String> comparator = Comparator.comparingInt(String::length);
        Collections.sort(list, comparator);*//*
        //list.forEach(System.out::println);

        list.stream()
                .sorted((o1, o2) -> o1.length() - o2.length()) // or .sorted(Comparator.comparingInt(String::length))
                //.sorted((o1, o2) -> o2.length() - o1.length()) // reverse sort
                .forEach(System.out::println);*/
    }

    public void check() {
        System.out.println("hello1");
    }

    /*static class StringLengthComparator implements Comparator<String>{
        public int compare (String obj1, String obj2) {
            return obj1.length() - obj2.length();
        }
    }*/

    interface Confirmable {
        boolean isConfirmed(int num);
    }

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