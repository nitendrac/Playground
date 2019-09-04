#include<stdio.h>
int main()
{
  int num,first,last;
  scanf("%d",&num);
  last=num%10;
  first=(num/10)%10;
  printf("%d",first+last);
  return 0;
}