x = int(input())

n = 1
while True:
    if ((n-1)*n)/2 < x <= (n*(n+1))/2:
        dist = x - (n*(n-1))/2 - 1
        
        if (n % 2) == 1:
            print("{}{}{}".format(int(n-dist), "/", int(1+dist)))
        else:
            print("{}{}{}".format(int(1+dist), "/", int(n-dist)))
        break
        
    n += 1
