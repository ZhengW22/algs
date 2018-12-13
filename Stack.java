import java.util.Iterator;

import edu.princeton.cs.algs4.*;

/**
 * Stack
 */
public class Stack<Item> implements Iterable {

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N;
    public boolean isEmpty() {
        return N == 0;
        // or return first == null;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    
    private class StackIterator implements Iterator<Item> {
        private int i = N;
        private Node tmp = first;
        public boolean hasNext() {
            return i > 0;
        }
        public Item next() {
            Item item = tmp.item;
            tmp = tmp.next;
            return item;
        }
        public void remove() {}
    }
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            }
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
