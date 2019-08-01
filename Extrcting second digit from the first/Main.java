#include <stdio.h>
int main() 
{
	int a,b,c,n;
  scanf("%d",&n);
  if(n<10000)
  {
    a=n%10;
   printf("%d",a);
  }
  else 
  {
    b=n/1000;
    c=b%10;
    printf("%d",c);
    
  }
  
	return 0;
}