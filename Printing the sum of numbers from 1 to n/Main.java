#include <stdio.h>
int main() {
	int sum=0,i,n,last;
    scanf("%d",&n);
    for(i=n;i>0;i--)
    {
      last=i%10;
      sum+=last;
    }
  	printf("%d",sum);
	return 0;
}