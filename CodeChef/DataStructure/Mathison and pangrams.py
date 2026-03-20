
for i in range(int(input())):
    
    prices = list(map(int, input().split()))
    letters = input()
    # print(letters)
    cost = 0
    for i in range(26):
        letter = chr(ord('a') + i)
        
        if letter not in letters:
            # print(letter)
            cost += prices[i]
    print(cost)
