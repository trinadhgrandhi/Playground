#include <stdio.h>
int main()
{
int a,b,n,sum;
  sum=0;
  scanf("%d",&n);
  a=n;
  while(n>0)
  {
    b=n%10;
    sum=sum+b;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}