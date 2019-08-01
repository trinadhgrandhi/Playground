#include <stdio.h>
int main()
{
    long int n,d=1,i;
    scanf("%ld",&n);
    for(i=1;i<=n;i++)
    {
        d=d*i;
    }
    printf("%ld",d);    
    return 0;
}


