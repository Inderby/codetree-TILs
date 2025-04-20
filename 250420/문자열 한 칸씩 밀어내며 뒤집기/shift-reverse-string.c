#include <stdio.h>
#include <string.h>

void reverseString(char *str) {
    int length = strlen(str);
    int i, j;
    char temp;
    
    for (i = 0, j = length - 1; i < j; i++, j--) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

int main() {
    // Please write your code here.
    char s[1001];
    char result[1001];
    int q;
    scanf("%s %d", s, &q);
    int len = strlen(s);
    for(int i = 0; i < q; i++){
        int command;
        scanf("%d", &command);
        if(command == 1){
            char temp = s[0];
            for(int j = 0; j < len - 1; j++){
                s[j] = s[j + 1];
            }
            s[len - 1] = temp;
        }
        else if(command == 2){
            char temp = s[len - 1];
            for(int j = len - 1; j > 0; j--){
                s[j] = s[j - 1];
            }
            s[0] = temp;
        }
        else if(command == 3){
            reverseString(s);
        }

        printf("%s\n", s);
    }
    return 0;
}