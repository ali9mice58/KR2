public class InterpolationSearch {
    public static int search(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi && key >= a[lo] && key <= a[hi]) {
            if (lo == hi) return a[lo] == key ? lo : -1;
            int pos = lo + ((key - a[lo]) * (hi - lo)) / (a[hi] - a[lo]);
            if (a[pos] == key) return pos;
            if (a[pos] < key) lo = pos + 1;
            else hi = pos - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 7, 9, 11};
        System.out.println(search(a, 7));
    }
}
