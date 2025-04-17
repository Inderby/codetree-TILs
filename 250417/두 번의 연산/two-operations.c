#include <stdio.h>

int main() {
    // Please write your code here.
    int a;
    scanf("%d", &a);
    if(a % 2 == 1)
        a += 3;
    
    if(a % 3 == 0)
        a /= 3;
    
    printf("%d", a);
    return 0;
}