#include <stdio.h>
int main() {
    int i,j,n,num;
    scanf("%d",&n);
    num=n;
    for (i=n;i>=1;i--)
    {
      for (j=i;j>=1;j--)
      {
        
            printf("%d",j);
        
      }
      printf("\n");
    }
	return 0;
}