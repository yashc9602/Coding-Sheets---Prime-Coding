# Python3 code to find the area of inscribed
# circle of right angled triangle
PI = 3.14159265

# Function to find the area of
# inscribed circle


def area_inscribed(P, B, H):
	return ((P + B - H)*(P + B - H)*(PI / 4))


# Driver code
P = 3
B = 4
H = 5
print(area_inscribed(P, B, H))
