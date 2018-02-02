#           NULL 1   2   3   4   5   6   7   8   9  10  11  12
callendar = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

#              0      1      2      3      4      5      6
dayOfWeek = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

x, y = map(int, input().split())
day = 0
for i in range(x):
    day += callendar[i]

print(dayOfWeek[(day+y) % 7])
