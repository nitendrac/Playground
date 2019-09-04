#include <stdio.h>
int main() {
	int n,last,ans;
    scanf("%d",&n);
    while(n>10)
    {
      last=n%10;
      ans=last;
      n=n/10;
    }
  printf("%d",last);
	return 0;
}