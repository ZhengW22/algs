/**
 * HelloWorld
 */
import edu.princeton.cs.algs4.*;
 public class HelloWorld {

    private int m;

    public HelloWorld() {
        this.m = 1;
    }

    // public static int changM(int n) {
    //     this.m = n;
    // }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i=0; i<N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
