#include <stdio.h>
int main() {
	int num,n=1;
    scanf("%d",&num);
    while(n<=num)
    {
      if(n%2==1)
      {
        printf("%d\n",n);
      }
      n=n+1;
    }
	return 0;
}