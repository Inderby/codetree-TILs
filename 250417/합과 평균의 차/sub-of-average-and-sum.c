#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    printf("%d\n%d\n%d", a + b + c, (a + b + c)/3, a + b + c - (a + b + c)/3);
    return 0;
}