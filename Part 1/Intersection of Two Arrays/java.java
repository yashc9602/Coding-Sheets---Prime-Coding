import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        List<Integer> result = intersection(arr1, arr2);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
