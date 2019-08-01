#include<stdio.h>
int main()
{
  float r,m,p,t;
  scanf("%f%f%f",&p,&t,&r);
  m=p*t*r/100;
  printf("%f",m);
  return 0;
}