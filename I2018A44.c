#include <stdio.h>

void main()
{
    int a = 20, b = 30;
    
    if(a++ <= 20 || ++b > 30)
        b++;
    printf("%d %d\n", a++, b); // 21 31
}
