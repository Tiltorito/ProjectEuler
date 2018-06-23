def sumOfEvenFibo(limit):
	mem = [1,2]
	sum = 2
	i = 2;
	while True:
		next_term = mem[i-1] + mem[i-2]
		print(next_term)
		if next_term >= limit:
			break
		mem.append(next_term)
		if next_term % 2 == 0:
			sum += next_term
		i+=1
	return sum


print(sumOfEvenFibo(4000000))
