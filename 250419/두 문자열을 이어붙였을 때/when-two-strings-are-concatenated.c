#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char a[101], b[101];
    char r1[201] = {0}, r2[201] = {0};
    scanf("%s %s", a, b);
    strcat(r1, a);
    strcat(r1, b);
    strcat(r2, b);
    strcat(r2, a);
    for(int i = 0; i < strlen(r1); i++){
        if(r1[i] != r2[i]){
            printf("false");
            return 0;
        }
    }
    printf("true");
    return 0;
}