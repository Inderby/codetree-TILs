#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str[101];
    char c;
    fgets(str, 100, stdin);
    scanf("%c", &c);
    int count = 0;
    for(int i = 0;  i < strlen(str); i++){
        if(str[i] == c){
            count++;
        }
    }
    
    printf("%d", count);
    return 0;
}