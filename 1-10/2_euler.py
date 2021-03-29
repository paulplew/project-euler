def fib(num):
    if num == 0 or num == 1:
        return 1
    else:
        return fib(num - 1) + fib(num - 2)


current = 0
total = 0
while fib(current) < 4000000:
    fib_num = fib(current)
    if fib_num % 2 == 0:
        total += fib_num
    current += 1
print(total)
