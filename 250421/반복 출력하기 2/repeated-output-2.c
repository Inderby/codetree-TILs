#include <stdio.h>
#include <string.h>


void func(int n){
    if(n == 0){
        return;
    }
    func(n-1);
    printf("HelloWorld\n");
}
int main() {
    int n;
    scanf("%d", &n);
    func(n);
    return 0;
}