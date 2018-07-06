def divisble_by(num, limit):
	if num % 2 != 0:
		return False

	for i in range(limit, 3, -1):
		if num % i != 0:
			return False
	return True

def smallest_multiple(limit):
	found = False
	
	i = limit
	
	while not found:
		if divisble_by(i, limit):
			found = True
		else:
			i += 1
	return i

print(smallest_multiple(20))