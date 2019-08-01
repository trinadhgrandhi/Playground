#include <stdio.h>
int main() {
  int n;
  int count = 1;
  scanf("%d",&n);
  while(count <= n){
if(count % 2 == 1)
{
    printf("%d\n",count);
     
}
     count = count+1;
  }
	return 0;
}
