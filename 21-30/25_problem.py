def fib(num):
    if num == 1 or num == 2:
        return 1
    else:
        return fib(num - 1) + fib(num - 2)


print(fib(1000))