#include <stdio.h>
#include <stdio.h>
#include <cs50.h>
#include <string.h>
#include <math.h>

int main(void)
{

float a = get_float("Change owed: ");
int coinCount = 0;
int balance = round(a * 100);

while (balance >= 25)
{
    balance -= 25;
    coinCount += 1;
}

while( balance >= 10)
{
    balance -= 10;
    coinCount += 1;
}

while(balance >= 5)
{
    balance -= 5;
    coinCount += 1;
}

while (balance >= 1)
{
    balance -= 1;
    coinCount += 1;
}

printf("%d",coinCount);

   
}
