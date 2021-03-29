def product(nums):
    total = 1
    for x in nums:
        total *= x
    return total


def add_to(x, list):
    list.append(x)
    return list


large_number = 3142693
factors = []
i = 2

# while the large number is greater than one
# divide the number if a factor is found
while large_number > 1:
    if large_number % i == 0:
        large_number /= i
        factors.append(i)
        print("large_number = {}").format(large_number)
        print("factors = {}").format(factors)
        print("i = {}").format(i)
        i = 1
    i += 1

