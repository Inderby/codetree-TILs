#include <stdio.h>

int main() {
    // Please write your code here.
    int N;
    scanf("%d", &N);

    if(N >= 3000){
        printf("book");
    }else if(N >= 1000){
        printf("mask");
    }else{
        printf("no");
    }
    return 0;
}