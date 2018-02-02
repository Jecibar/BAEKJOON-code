inputCnt = int(input())

inputHWN = []
for i in range(inputCnt):
    inputHWN.append(list(map(int, input().split())))

for i in range(inputCnt):
    h = inputHWN[i][0]
    n = inputHWN[i][2]

    if n%h == 0:
        yy = h
        xx = int(n/h)
    else:
        yy = n % h
        xx = int(n/h) + 1
    

    print("{}{}".format(yy, str(xx).zfill(2)))
