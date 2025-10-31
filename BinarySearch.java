public class BinarySearch {
    public static int search(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (a[m] == key) return m;
            if (a[m] < key) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {-5, 0, 3, 7, 11};
        System.out.println(search(a, 7));
    }
}
