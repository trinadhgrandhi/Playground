#include<stdio.h>
int main()
{
  int n,a,b;
  scanf("%d",&n);
  while(n>0)
  {
    a=n%10;
    b=b+a;
    n=n/10;
  }
  printf("%d",b);
  return 0;
}