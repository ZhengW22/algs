import edu.princeton.cs.algs4.*;
import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (key > a[mid])
                lo = mid;
            else if (key < a[mid])
                hi = mid;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whileList) < 0)
                StdOut.println(key);
        }
    }
}
