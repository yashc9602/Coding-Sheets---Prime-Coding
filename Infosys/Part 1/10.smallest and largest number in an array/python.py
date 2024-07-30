# python3 code to implement the idea

# Function to find the minimum
# and maxximum of the array


def findMinMax(arr, n):

	mini = arr[0]
	maxi = arr[0]

	for i in range(0, n):
		if (arr[i] < mini):
			mini = arr[i]

		elif (arr[i] > maxi):
			maxi = arr[i]

	return [mini, maxi]


if __name__ == "__main__":

	arr = [1, 2, 3, 4, 5]
	N = len(arr)

	# Function Call
	ans = findMinMax(arr, N)
	print(f"Maximum is: {ans[1]}")
	print(f"Minimum is: {ans[0]}")

