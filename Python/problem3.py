import math

def is_prime(x):
	if x == 2:
		return true
	elif x % 2 == 0:
		return False

	root = int(math.sqrt(x))

	for i in range(3, root, 2):
		if x % i == 0:
			return False
	return True

def largestPrimeFactor(num):
	max_prime_factor = 2 if num % 2 == 0 else 1

	root = int(math.sqrt(num))

	for i in range(3, root, 2):
		if num % i == 0 and is_prime(i):
			max_prime_factor = i;

	return max_prime_factor

print(largestPrimeFactor(600851475143))