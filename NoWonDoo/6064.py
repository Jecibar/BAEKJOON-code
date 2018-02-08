import math
repeatCnt = int(input())

for i in range(repeatCnt):
    M, N, x, y = map(int, input().split())

    keyDict = {}
    LCM = int(M*N/math.gcd(M, N))    # LCM = 최소공배수, gcd = 최대공약수
    for i in range(x, LCM+1, M):
        if i%M == x or i%M == 0: keyDict[i] = 1

    for i in range(y, LCM+1, N):
        if i%N == y or i%N == 0: keyDict[i] = 1

    flag = 0
    for key in keyDict:
        keyX = key%M
        keyY = key%N

        if x==M and key%M==0: keyX = x
        if y==N and key%N==0: keyY = y

        if (keyX == x and keyY == y):
            flag = 1; print(key)
            break

    if flag==0: print(-1)
