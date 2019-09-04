#include <stdio.h>
int main() {
	int n,fir,last,sum=0;
    scanf("%d",&n);
    
  	fir=n%10;
    while(n>0)
    {
      last=n%10;
      n=n/10;
    }
  	sum=fir+last;
    printf("%d",sum);
      
	return 0;
}