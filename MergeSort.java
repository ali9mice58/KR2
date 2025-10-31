public class MergeSort {
    static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) a[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }
    static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) >>> 1;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 4};
        sort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }
}
