from cs50 import get_int
from sys import argv
from csv import reader



if(len(argv) < 3):
    exit()

dbPath = argv[1]
sqPath = argv[2]
dna = " "
dnaVal = []
dnaSequence = {}
userDna = {}

with open(dbPath) as csvfile:
    spamreader = reader(csvfile)
    rowIndex = 0

    for row in spamreader:
        if(rowIndex == 0):
            for i in range(1,len(row)):
                dnaVal.append(row[i])
                dnaSequence[row[i]] = 0
        else:
            name = row[0]
            userDna[name] = {}
            for i in range(1,len(row)):
                userDna[name][dnaVal[i-1]] = row[i]

        rowIndex = rowIndex + 1

with open(sqPath) as csvfile:
    spamreader = reader(csvfile)

    for row in spamreader:
       dna = row[0]


for sq in dnaSequence:
    dnaString = sq
    length = len(dnaString)
    for i in range(0,len(dna) - length):
        current = dna[i: i+length]
        if dnaString == current:
            count = 1
            start = i + length
            end = start + length
            while(end <= len(dna) and current == dna[start:end]):
                count = count +1
                start = start + length
                end = end + length
            currentRep = dnaSequence[dnaString]
            if(currentRep < count):
                dnaSequence[dnaString] = count

for user in userDna:
    userSequence = userDna[user]
    totalMatches = 0
    for sq in userSequence:
        if(int(userSequence[sq]) == int(dnaSequence[sq])):
           totalMatches = totalMatches +1

    if(totalMatches == len(userSequence)):
        print(user)
        exit()

print("no match")

