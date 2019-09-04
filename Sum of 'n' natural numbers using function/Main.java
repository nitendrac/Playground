#include<stdio.h>
int SumNatural(int n)
{
  int sum=0,i;
  for (i=0;i<=n;i++)
  {
    sum+=i;
  }
  return sum;
}
  
int main() {
  int num;
  scanf("%d",&num);
  printf("%d",SumNatural(num));
  
    
  	return 0;
}