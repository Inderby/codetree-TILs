#include <stdio.h>

int main() {
    // Please write your code here.
    int a = 5, b = 6, c = 7;
    int temp = c;
    c = b;
    b = a;
    a = temp;
    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d", c); 
    return 0;
}