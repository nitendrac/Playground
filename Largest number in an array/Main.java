#include<stdio.h>
int main()
{
  int arr_size,i;
  int largest=0;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for (i=0;i<arr_size;i++)
    scanf("%d",&arr[i]);
   for (i=0;i<arr_size;i++)
   {
     if (largest<arr[i])
       largest=arr[i];
   }
  printf("%d",largest);
  
  return 0;
}