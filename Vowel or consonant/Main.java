#include<stdio.h>
int main()
{
  char h,a,e,i,o,u,A,E,I,O,U;
  scanf("%c",&h);
  if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'||h=='A'||h=='E'||h=='I'||h=='O'||h=='u')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}