#include<stdio.h>

int main()
{
 int a,b,c,d,f,g;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  f=a>b?b:a;
  g=c>d?d:c;
  if(g>f)
printf("%d",f);
else
  printf("%d",g);
}