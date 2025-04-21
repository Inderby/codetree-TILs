#include <stdio.h>

void func(int n){
    if(n == 0){
        return;
    }
    func(n - 1);
    for(int i = 0; i < n; i++){
        printf("*");
    }
    printf("\n");
    return;
}

int main() {
    int n;
    scanf("%d", &n);
    func(n);
    return 0;
}