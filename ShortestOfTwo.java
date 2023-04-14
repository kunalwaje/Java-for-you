
public class ShortestOfTwo {
    public static void main(String args[]) {
        int a = 30;
        int b = 10;
        int c = 56;

        // int ans = a < b ? (a < c ? a : c) : (b < c ? b : c);

        int ans = a < (b < c ? b : c) ? a : (b < c ? b : c);

        System.out.println(ans);
    }
}
