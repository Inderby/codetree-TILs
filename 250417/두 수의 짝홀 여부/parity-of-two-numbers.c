#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    if(a % 2 == 0){
        printf("even\n");
    }else {
        printf("odd\n");
    }

    if(b % 2 == 0){
        printf("even");
    }else {
        printf("odd");
    }
    return 0;
}