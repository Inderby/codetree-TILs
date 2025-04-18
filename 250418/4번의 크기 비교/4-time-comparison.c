#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b, c, d, e;
    scanf("%d", &a);
    scanf("%d %d %d %d", &b, &c, &d, &e);
    printf("%d\n", a > b);
    printf("%d\n", a > c);
    printf("%d\n", a > d);
    printf("%d\n", a > e);
    return 0;
}