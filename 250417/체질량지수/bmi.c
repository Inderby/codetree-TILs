#include <stdio.h>

int main() {
    // Please write your code here.
    int h, w, b;
    scanf("%d %d", &h, &w);

    b = (10000 * w) / (h * h);
    printf("%d\n", b);
    if(b >= 25){
        printf("Obesity");
    }

    return 0;
}