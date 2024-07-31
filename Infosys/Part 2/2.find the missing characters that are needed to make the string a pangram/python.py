def main():
	str_ = "The quick brown fox jumps over the dog"
	
	# Use a set to store present characters
	present_chars = set()

	# Add each character to the set
	for char in str_:
		if char.isalpha():
			present_chars.add(char.lower())

	# Check which characters are missing
	missing_chars = "".join(c for c in "abcdefghijklmnopqrstuvwxyz" if c not in present_chars)

	# Print the missing characters
	if not missing_chars:
		print("The string is a pangram.")
	else:
		print(missing_chars)

if __name__ == "__main__":
	main()

