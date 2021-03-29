def is_palindrome(num):
    str_num = str(num)
    length = len(str_num)
    if length % 2 == 0:
        first_half = str_num[0:length / 2]
    else:
        first_half = str_num[0:length / 2 + 1]
    second_half = str_num[length / 2:length]
    return first_half == second_half[::-1]


largest_palindrome = 0
for i in range(101, 1000):
    for j in range(101, 1000):
        if is_palindrome(i * j) and i * j > largest_palindrome:
            largest_palindrome = i * j

print("Maximum palindrome is: {}".format(largest_palindrome))
