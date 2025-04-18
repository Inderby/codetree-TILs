#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str1[101], str2[101];
    fgets(str1, 100, stdin);
    fgets(str2, 100, stdin);
    for(int i = 0; i < strlen(str1); i++){
        if(str1[i] != ' ' && str1[i] != '\n')
            printf("%c", str1[i]);   
    }
    for(int i = 0; i < strlen(str2); i++){
        if(str2[i] != ' ' && str2[i] != '\n')
            printf("%c", str2[i]);   
    }
    return 0;
}