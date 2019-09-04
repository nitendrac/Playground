#include<stdio.h>
int main()
{
  int arr_size,i;
  scanf("%d\n",&arr_size);
  int arr[arr_size];
  for (i=0;i<arr_size;i++)
    scanf("%d\n",&arr[i]);
  int search_elem_1,search_elem_2;
  scanf("%d\n",&search_elem_1);
  scanf("%d\n",&search_elem_2);
  int element_1_index,element_2_index=-1;
  for (i=0;i<arr_size;i++)
  {
    if (search_elem_1==arr[i])
      element_1_index=(i);
     
  }
  printf("%d\n",element_1_index);
  for (i=0;i<arr_size;i++)
  {
    if (search_elem_2==arr[i])
      element_2_index=(i);
   
  }
  printf("%d\n",element_2_index);
   
   
  
  return 0;
}