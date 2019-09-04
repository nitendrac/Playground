// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int max=0,a[50],i,num,pos;
  scanf("%d\n",&num);
  for (i=0;i<num;i++)
  {
    scanf("%d ",&a[i]);
  }
  for (i=0;i<num;i++)
  {
    if (max<a[i])
    {
      max=a[i];
      pos=i;
    }
  }
  printf("%d",pos);

        
  
   return 0;
}