import math
def is_palidrome(num):
	reverse = 0
	backup = num
	
	while num > 0:
		reverse *= 10
		reverse += num % 10
		num //= 10

	return reverse == backup


def largest_palidrome(digits):
	limit = int(math.pow(10, digits))
	greater = 0
	for i in range(limit // 10, limit):
		for j in range(limit // 10, limit):
			product = i * j
			if is_palidrome(product):
				greater = max(greater, product)
	return greater

a


print(largest_palidrome(3))
