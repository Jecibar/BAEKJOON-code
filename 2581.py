m = int(input())
n = int(input())

result = []
for i in range(m, n+1):
    cnt = 0

    for j in range(1, i+1):
        if i%j == 0:
            cnt += 1

    if cnt == 2:
      result.append(i)

if len(result) >= 1:
    print(sum(result))
    print(result[0])
else:
    print(-1)

