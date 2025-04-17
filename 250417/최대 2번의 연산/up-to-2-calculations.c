#include <stdio.h>

int main() {
    // Please write your code here.
    int a;
    scanf("%d", &a);
    if(a % 2 == 0)
        a /= 2;
    
    if(a % 2 == 1)
        ++a /= 2;
    printf("%d", a);
    return 0;
}