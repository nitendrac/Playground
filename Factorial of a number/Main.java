#include <stdio.h>
int main() {
	int fact,prod=1;
    scanf("%d",&fact);
    while(fact>0)
          {
            prod*=fact;
            fact=fact-1;
          }
     printf("%d",prod);
            
	return 0;
}