#include <stdio.h>
#include <string.h>

void func1(int step, int n){
    if(step > n)
        return;
    printf("%d ", step);
    func1(step + 1, n);
    return;
}

void func2(int step, int n){
    if(step > n)
        return;
    
    func2(step + 1, n);
    printf("%d ", step);
    return;
}

int main() {
    int n;
    scanf("%d", &n);
    func1(1, n);
    printf("\n");
    func2(1, n);
    return 0;
}