#include<stdio.h>
int main(void)
{
    float i =1;
    float n;
    printf("Watch out! Here come a bunch of fractions!\n");
    while (i < 30)
    {
        n = 1/i; 
        printf(" %f", n);
        i++;
    }
    printf("\nThat's all folks!");
    return 0;
}