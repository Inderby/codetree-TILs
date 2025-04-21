#include <stdio.h>

int func(int n){
    if(n < 10){
        return n * n;
    }
    int i = n % 10;
    return i * i  + func(n / 10);

}

int main() {
    int n;
    scanf("%d", &n);
    printf("%d", func(n));
    return 0;
}