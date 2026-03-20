
t = int(input())

for i in range(t):
    n, x, y = map(int, input().split())
    s = input()
    
    c1 = s.count('0')
    c2 = s.count('1')
    
    
    if c1 == 0 or c2 == 0:
        print(0)
    else:
        print(min(x,y))
