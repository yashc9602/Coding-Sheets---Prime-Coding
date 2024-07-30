public class SwapArrays {
    public static void swap(int[] a, int[] b) {
        int n = a.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
            b[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        swap(a, b);

        System.out.print("a[] = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("\nb[] = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}
