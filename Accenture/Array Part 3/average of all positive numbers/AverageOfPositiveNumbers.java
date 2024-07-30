
public class AverageOfPositiveNumbers {
    public static double averageOfPositiveNumbers(int[] arr) {
        int totalSum = 0, count = 0;
        
        for (int num : arr) {
            if (num > 0) {
                totalSum += num;
                count++;
            }
        }
        
        if (count == 0) {
            return 0;  // Return 0 or appropriate value if no positive numbers found
        }
        return (double) totalSum / count;
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 5, 7, -2, 4, -1};
        double average = averageOfPositiveNumbers(arr);
        System.out.println("Average of positive numbers: " + average);
    }
}
