#include<stdio.h>
int main()
{
  int sum=0,rem,i;
  long int n;
  scanf("%ld",&n);
  i=0;
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%ld",sum);
  return 0;
}