# Python3 program to sort a string 
# of characters 

# function to print string in
# sorted order 
def sortString(str) :
	str = ''.join(sorted(str))
	print(str)

# Driver Code
s = "primecoding"
sortString(s) 
