#include<stdio.h>
int main()
{
int num,fd,td,s;
  scanf("%d",&num);
  fd=num/100;
  td=num%10;
  s=fd+td;
  printf("%d",s); 
  return 0;
}