package linked;

public class LinkList {
    private final Node first = new Node();
    private final Node last = new Node();

    public LinkList() {
        first.next = last;
        //last.prev = first;
    }

    public void add(String str){

    }
    public static class Node {
        //private Node prev;
        private String value;
        private Node next;
    }
}