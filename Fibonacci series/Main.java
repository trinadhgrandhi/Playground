#include<stdio.h>
int main()
{
int n,a=1,b=0,c,i;
scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ",b);
    c=a+b;
    a=b;
    b=c;
  }
  return 0;
}