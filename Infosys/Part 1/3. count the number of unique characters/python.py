# Python 3 program of the above approach

# Program to count the number of
# unique characters in a string
def cntDistinct(st):

	# Set to store unique characters
	# in the given string
	s = set([])

	# Loop to traverse the string
	for i in range(len(st)):

		# Insert current character
		# into the set
		s.add(st[i])

	# Return Answer
	return len(s)

# Driver Code
if __name__ == "__main__":

	st = "primecoding"
	print(cntDistinct(st))

