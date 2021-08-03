from cs50 import get_float 
a = get_float("Change owed: ")
coinCount = 0
balance = int(a * 100)

while balance >= 25:
    balance -= 25
    coinCount += 1
    
while balance >= 10:
    balance -= 10
    coinCount += 1
    
while balance >= 5:
    balance -= 5
    coinCount += 1
    
while balance >= 1:
    balance -= 1
    coinCount += 1
    
print(coinCount)
