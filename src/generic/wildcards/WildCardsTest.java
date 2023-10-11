package generic.wildcards;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class WildCardsTest {
    List list;
    List list1;
    static class C{}
    static class A extends C{}
    static class B extends A{}
    static class D extends B{}

    public static void main(String[] args) {
        WildCardsTest test = new WildCardsTest();

        MyType<String> str = new MyType<>();

        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<C> listC = new ArrayList<>();
        List<D> listD = new ArrayList<>();

        test.setList(listA);
        test.setList(listB);
        test.setList(listD);
        //test.setList(listC);

        test.setList1(listA);
        //test.setList1(listB);
        //test.setList1(listD);
        test.setList1(listC);
    }


    void setList(List<? extends A> list){
        this.list = list;
    }
    void setList1(List<? super A> list){
        this.list1 = list;
    }
}

class MyType<E>{
}