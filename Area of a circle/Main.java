#include<stdio.h>
int main()   
{
int d;
scanf("%d",&d);
float pi=3.14,area,r;
  r=(float)d/2;
scanf("%f",&r);
 area=pi*r*r;
printf("%0.2f", area);  
return 0;
}