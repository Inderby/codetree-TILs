#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s[101];
    scanf("%s", s);
    for(int i = 1; i < strlen(s) - 1; i++){
        s[i] = s[i+1];
    }

    for(int i = strlen(s) - 3; i < strlen(s) - 2; i++){
        s[i] = s[i+1];
    }

    s[strlen(s) - 2] = '\0';
    printf("%s", s);
    return 0;
}