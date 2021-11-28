def sum_proper_divisors(num):
    sum = 0
    i = num - 1
    while i > 0:
        if num % i == 0:
            sum += i
        i -= 1
    return sum


total = 0

for x in range(1, 10000):
    spd_of_x = sum_proper_divisors(x)
    spd_of_spd_of_x = sum_proper_divisors(spd_of_x)

    if spd_of_spd_of_x == x and x != spd_of_x:
        total += x

    # print("x = {}").format(x)
    # print("d(a) = {}").format(spd_of_x)
    # print("d(b) = {}").format(spd_of_spd_of_x)
    # print("total = {}").format(total)

print(total)
