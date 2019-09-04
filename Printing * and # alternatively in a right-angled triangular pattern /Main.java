#include <stdio.h>

int main()
{
    int i, j, k, N;
     scanf("%d", &N);

    k = 1;

    for(i=1; i<=N; i++)
    {
        // Logic to print numbers
        for(j=1; j<=i; j++, k++)
        {
            if(k%2==1)
              printf("*");
          else
               printf("#");
        }

        printf("\n");
    }
    return 0;
    }
