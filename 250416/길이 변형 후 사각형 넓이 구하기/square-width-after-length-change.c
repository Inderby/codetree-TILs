#include <stdio.h>

int main() {
    // Please write your code here.
    int width, height;
    scanf("%d %d", &width, &height);
    width += 8;
    height *= 3;
    printf("%d\n%d\n%d", width, height, width * height);
    return 0;
}