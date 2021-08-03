from cs50 import get_int 
from sys import argv
from csv import reader

while True :
    a = get_int("Height: ")

    if a >= 1 and a <= 8:
        break

for i in range(a):
    for k in range(a):
        if i + k >= a - 1:
            print("#", end="")
        else:
            print(" ", end="")
    print()
