#include <stdio.h>
int main() {
  int i,num;
  scanf("%d",&num);
  for (i=1;i<=num;i++)
  {
    printf("%d",i);
    if( (i%3==0)&& (i!=num))
    {
		printf(",");
    }
  }
     
	
	return 0;
}