import math
inputCnt = int(input())

for repeat in range(inputCnt):
    x, y = map(int, input().split())
    y, x = y - x, 0

    i = int(math.sqrt(y))
    remainder = y - i*i

    frt, mid, bak = i, 0, i-1
    while remainder>0:
        mid       += int(remainder / i)
        remainder %= i
        i -= 1

    print(frt + mid + bak)
