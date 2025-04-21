#include <stdio.h>
#include <string.h>

int main() {
    char a[101], b[101];
    int n = 0;
    scanf("%s %s", a, b);
    int len = strlen(a);
    for(int i = 0; i < len; i++){
        if(strcmp(a, b) == 0){
            break;
        }
        char temp = a[len - 1];
        for(int j = len - 1; j > 0; j--){
            a[j] = a[j - 1];
        }
        a[0] = temp;
        n = n + 1;
        // printf("%s\n", a);
    }
    
    printf("%d", n == len ? -1 : n);

    return 0;
}