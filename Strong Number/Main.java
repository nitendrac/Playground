#include <stdio.h>
int main() 
{
	int fact(int x)
    {
      int prod=1;
      while(x>0)
      {
        prod*=x;
        x=x-1;
      }
      return prod;
    }
    int num,sum=0,last,check;
    scanf("%d",&num);
    check=num;
    while(num>0)
    {
      last=num%10;
      sum+=fact(last);
      num=num/10;
    }
    if(sum==check)
    {
      printf("Yes");
    }
    else
    {
      printf("No");
    }
  
  
      
    
	return 0;
}