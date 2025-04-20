#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s[21];
    scanf("%s", s);
    while(strlen(s) > 1){
        int idx;
        scanf("%d", &idx);
        if(strlen(s) - 1 < idx){
            idx = strlen(s) - 1;
        }
        int i = idx;
        for(; i < strlen(s) - 1; i++){
            s[i] = s[i + 1];
        }
        s[i] = '\0';
        
        printf("%s\n", s);
    }
    return 0;
}