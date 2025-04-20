#include <stdio.h>
#include <string.h>

int main(){
    char str[100];
    scanf("%s", str);
    int len = strlen(str);
    for(int i = 0; i < len; i++){
        if(str[i] == 'e'){
            for(int j = i; j < len - 1; j++){
                str[j] = str[j + 1];
            }
            break;
        }
    }
    str[len - 1] = '\0';
    printf("%s", str);
    return 0;
}