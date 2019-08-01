#include<stdio.h>
#include<math.h>
int main()
{
float r,a,arc,pi=3.14;
scanf("%f%f",&r,&a);
arc=a/360*2*pi*r;
printf("%0.2f",arc);
return 0;
}