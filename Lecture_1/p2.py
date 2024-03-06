num = int(input())

print(num)


if (num > 5 and num <= 10 and num != 7):
    num = num + 2
elif (num < 5 and num % 2 == 0):
    num = num / 2
elif (num == 7):
    num = num + 1

print(num)
