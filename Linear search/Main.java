#include<stdio.h>
int main()
{
  int a[20],n,b,i,j=0,w=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&b);
  for(i=0;i<n;i++)
  {
    w++;
    if(a[i]==b)
    {
      j++;
    break;
    }
  }
  if(j>=1)
  {
  printf("%d",w);
  }
  else
    printf("%d isn't present in the array.",b);
  
  return 0;
}