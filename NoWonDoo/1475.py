x = input().replace("6", "t").replace("9", "t")

dict = {}
dict['t'] = 0
for i in range(len(x)):
    if dict.get(x[i]) == None:
        dict[x[i]] = 1
    else:
        dict[x[i]] += 1

dict['t'] = round(dict['t']/2 + 0.1)

print(max(dict.values()))
