#include<stdio.h>
int main(){
    int n,i,powr=1,base,expo;
    scanf("%d",&base);
    scanf("%d",&expo);
    for (i=0;i<expo;i++)
    {
      powr=base*powr;
    }
    printf("%d",powr);
    
  	return 0;
}