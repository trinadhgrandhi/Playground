#include<stdio.h>
int main()
{
int num,sec,last;
  scanf("%d",&num);
  sec=num%100;
  last=sec/10;
  printf("%d",last);
}