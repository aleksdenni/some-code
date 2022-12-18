package linked;

public class LinkList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        //Node currentElement = last.prev;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        if (first.next == null) {
            node.value = value;
            first.next = node;
            last.prev = node;
        } else {
            node.value = value;
            node.prev = last.prev;
            node.prev.next = node;
            last.prev = node;
        }
    }
    /*public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }*/

    public String get(int index) {
        if (index < 0) return null;
        Node tempVar = first.next;
        for (int i = 0; i < index; i++) {
            tempVar = tempVar.next;
            if (tempVar == null) return null;
        }
        return tempVar.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}