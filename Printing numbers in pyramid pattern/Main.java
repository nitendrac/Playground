#include <stdio.h>

int main()
{
    int i, j, rows,k,num=1;

    /* Input number of rows to print */
    scanf("%d", &rows);

    /* Iterate through rows */
    for(i=1; i<=rows; i++)
    { 
        /* Print leading spaces */
        for(k=1; k<=(rows-i); k++)
        {
            printf(" ");
        }

        /* Print star */
        for(j=1;j<=i;j++)
        {
            printf("%d ",num);
           num+=1;
        }

        /* Move to next line */
        printf("\n");
    }

    return 0;
}