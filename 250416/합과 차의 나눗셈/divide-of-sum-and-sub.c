#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    int c = a + b;
    int d = a - b;
    double result = (double) c / d;
    printf("%.2lf", result);
    return 0;
}