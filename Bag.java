import edu.princeton.cs.algs4.*;
import java.util.Iterator;


/**
 * Bag
 */
public class Bag<Item> implements Iterable {

    private class Node {
        Item item;
        Node next;
    }
    private Node first;
    private int N = 0;
    public boolean isEmpty() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current == null;
        }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() {}
    }
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
}
