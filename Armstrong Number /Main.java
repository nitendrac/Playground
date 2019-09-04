#include <stdio.h>
int main() {
	int num,sum=0,n,last;
    scanf("%d",&n);
    num=n;
    while( n>0)
    { 
      last=n%10;
      sum+=last*last*last;
      n=n/10;
    }
    if (sum==num)
    {
      printf("Armstrong Number\n");
    }
    else
    {
      printf("Not an Armstrong Number\n");
    }
      
	return 0;
}