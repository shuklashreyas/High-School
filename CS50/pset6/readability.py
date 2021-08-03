from cs50 import get_string
text = get_string("Text: ");
letterscount = 0
wordcount = 1
sentencecount = 0

for i in range (0,len(text)):
    if (text[i] >= 'a' and text[i] <= 'z') or (text[i] >= 'A' and text[i] <= 'Z'):
        letterscount+= 1
    
    elif text[i] == ' ':
        wordcount+= 1
       
    elif text[i] == '.' or text[i] == '!' or text[i] == '?':
        sentencecount+= 1
       
    

grade = 0.0588 * (100 *  letterscount /  wordcount) - 0.296 * (100 *  sentencecount /  wordcount) - 15.8
   
if grade < 16 and grade >= 0:
    print("Grade: " + str(int(round(grade))))
    print()
    
elif grade >= 16:
    print("Grade 16+\n")

else:
    print("Before Grade 1\n")
    

