#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    if(a > b){
        printf("%d", a - b);
    }else{
        printf("%d", b - a);
    }
    return 0;
}