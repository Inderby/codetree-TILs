#include <stdio.h>
#include <string.h>

int main(){
    char s[21];
    scanf("%s", s);
    char temp = s[0];
    int len = strlen(s);
    for(int i = 0; i < len - 1; i++){
        s[i] = s[i + 1];
    }
    s[len - 1] = temp;
    printf("%s", s);
    return 0;
}