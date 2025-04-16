#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    a += b;
    b += a;
    printf("%d %d", a, b);
    return 0;
}