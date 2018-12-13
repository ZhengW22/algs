import edu.princeton.cs.algs4.*;

/**
 * FixedCapacityStackOfStrings
 */
public class FixedCapacityStackOfStrings<Item> {

    private Item[] a;
    private int N;
    public FixedCapacityStackOfStrings(int cap) {
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        a[N++] = item;
    }
    public Item pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!StdIn.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("("+s.size()+" left on stack)");
    }
}
