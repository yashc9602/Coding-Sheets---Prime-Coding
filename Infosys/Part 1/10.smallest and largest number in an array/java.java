// Java Code to implement the above idea

class PRIME {

	// Function to find the minimum and maxximum of the
	// array
	static int[] findMinMax(int[] arr, int n)
	{
		int mini = arr[0];
		int maxi = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] < mini) {
				mini = arr[i];
			}
			else if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		int[] ans = new int[2];
		ans[0] = mini;
		ans[1] = maxi;
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int N = arr.length;

		// Function call
		int[] ans = findMinMax(arr, N);
		System.out.print("Maximum is: " + ans[1]);
		System.out.print("\n"
						+ "Minimum is: " + ans[0]);
	}
}

