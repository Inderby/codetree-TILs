#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int temp = a;
    a = b;
    b = temp;
    printf("%d %d", a, b);
    return 0;
}