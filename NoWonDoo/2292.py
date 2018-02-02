x = int(input())

n = 1 
while True: 
    
    if 3*n*(n-1)+1 < x <= 3*n*(n+1)+1: 
        print(n+1)
        break

    elif x == 1:
        print(1)
        break
        
    n += 1
