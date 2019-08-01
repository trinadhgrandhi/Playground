#include<stdio.h>
int main()
{
 int n,b[1000],j,i;
  scanf("%d",&n);
  i=0;
  while(n>0)
  {
    b[i]=n%8;
    n=n/8;
    i++;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",b[j]);
  return 0;
}