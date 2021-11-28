import math


def sum_proper_divisors(num):
    sum = 1
    i = 2
    while i <= math.sqrt(num):
        if num % i == 0:
            sum += i
            if not (num / i == i):
                sum += num / i
        i += 1
    return sum


def is_abundant(num):
    return sum_proper_divisors(num) > num


def sum_of_two(num, lon):
    for x in range(1, len(lon)):
        for j in range(x, len(lon)):
            if lon[x] + lon[j] == num:
                return True
    return False


total = 0
A005101 = []
sum_of_abundant = [False] * 28124

for i in range(12, 28124):
    if is_abundant(i):
        # print(i)
        A005101.append(i)

for i in range(len(A005101)):
    for j in range(i, len(A005101)):
        k = A005101[i] + A005101[j]
        if k > 28123:
            break
        sum_of_abundant[k] = True

for i in range(0, 28124):
    if not sum_of_abundant[i]:
        total += i

print(total)
