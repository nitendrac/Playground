#include<stdio.h>
int main()
{
  int num,first,third;
  scanf("%d",&num);
  first=num%10;
  third=num/100;
  printf("%d",first+third);
  return 0;
}