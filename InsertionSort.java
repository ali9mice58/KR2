public class InsertionSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] a = {9, 2, 5, 1};
        sort(a);
        for (int x : a) System.out.print(x + " ");
    }
}
