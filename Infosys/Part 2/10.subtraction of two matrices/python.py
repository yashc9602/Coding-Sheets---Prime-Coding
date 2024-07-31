# Python 3 program for subtraction 
# of matrices 

N = 4

# This function returns 1 
# if A[][] and B[][] are identical 
# otherwise returns 0 
def subtract(A, B, C): 
	
	for i in range(N): 
		for j in range(N): 
			C[i][j] = A[i][j] - B[i][j] 

# Driver Code 
A = [ [1, 1, 1, 1], 
	[2, 2, 2, 2], 
	[3, 3, 3, 3], 
	[4, 4, 4, 4]] 

B = [ [1, 1, 1, 1], 
	[2, 2, 2, 2], 
	[3, 3, 3, 3], 
	[4, 4, 4, 4]] 
					
C = A[:][:] # To store result 
	
subtract(A, B, C) 

print("Result matrix is") 
for i in range(N): 
	for j in range(N): 
		print(C[i][j], " ", end = '') 
	print() 
	
