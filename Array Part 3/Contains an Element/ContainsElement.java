public class ContainsElement {
    public static boolean containsElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        if (containsElement(arr, target)) {
            System.out.println("The array contains the element " + target);
        } else {
            System.out.println("The array does not contain the element " + target);
        }
    }
}
