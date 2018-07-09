def sumSquareDifference(n):
	squares = 0
	sum = 0;

	for i in range(1, n + 1):
		squares += pow(i, 2)
		sum += i

	return pow(sum, 2) - squares

print(sumSquareDifference(100))