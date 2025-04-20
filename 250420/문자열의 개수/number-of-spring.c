#include <stdio.h>
#include <string.h>

int main() {
    char s[200][201];
    int idx = 0;
    while(1){
        scanf("%s", s[idx]);
        if(strcmp("0", s[idx++]) == 0){
            break;
        }
    }
    printf("%d\n", idx - 1);
    for(int i = 0; i < idx - 1; i++){
        if(i % 2 == 1) continue;
        printf("%s\n", s[i]);
    }
    return 0;
}