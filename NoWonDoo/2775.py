import math
repeatCnt = int(input())

for i in range(repeatCnt):
    k = int(input())
    n = int(input())

    print(int(math.factorial(k+n)/(math.factorial(n-1)*math.factorial(k+1))))
