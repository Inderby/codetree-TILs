#include <stdio.h>
#include <string.h>

int main(){
    char s[11];
    scanf("%s", s);
    int len = strlen(s);
    printf("%s\n" , s);
    for(int i = 0; i < len; i++){
        char temp  = s[len - 1];
        for(int j = len - 1; j > 0; j--){
            s[j] = s[j-1];
        }
        s[0] = temp;
        printf("%s\n" , s);
    }
    return 0;
}