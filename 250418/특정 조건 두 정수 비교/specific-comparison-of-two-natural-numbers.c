#include <stdio.h>

int main() {
    // Please write your code here.
    int a, b;
    scanf("%d %d", &a, &b);
    if(a < b){
        printf("1 ");
    }else{
        printf("0 ");
    }

    if(a == b){
        printf("1");
    }else{
        printf("0");
    }
    return 0;
}