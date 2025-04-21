#include <stdio.h>
#include <string.h>

int func(char a[]){
    int len = strlen(a);
    for(int l = 0, r = len - 1; l < len / 2; l++, r--){
        if(a[l] != a[r]){
            return 0;
        }
    }
    return 1;
}

int main() {
    char A[101];
    scanf("%s", A);
    if(func(A)){
        printf("Yes");
    }else{
        printf("No");
    }
    return 0;
}