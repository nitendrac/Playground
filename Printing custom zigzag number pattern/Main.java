#include <stdio.h>

int main()
{
	int n,a=0;
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		if(i%2)
		{
			++a;
			for(int j=1;j<n;j++)
				printf("%d",a);
			printf("%d",++a);
		}
		else{
			printf("%d",++a);
			--a;
			for(int j=1;j<n;j++)
				printf("%d",a);
		}
		printf("\n");
	}
	return 0;
}