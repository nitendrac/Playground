#include <stdio.h>
int greatest(int n1,int n2,int n3)
{
  int gre;
  if(n1>n2)
  {
    if(n1>n3)
      gre=n1;
    else
      gre=n3;
  }
  else
  {
    if(n2>n3)
      gre=n2;
    else
      gre=n3;
  }
  return gre;
}
int main(){
  int n1,n2,n3;
  scanf("%d",&n1);
   scanf("%d",&n2);
   scanf("%d",&n3);
  printf("%d",greatest(n1,n2,n3));
  	return 0;
}