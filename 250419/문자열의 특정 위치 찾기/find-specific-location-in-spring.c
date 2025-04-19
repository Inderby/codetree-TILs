#include <stdio.h>

int main() {
    // Please write your code here.
    char s[21];
    scanf("%s", s);
    
    char c;
    scanf(" %c", &c);

    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == c){
            printf("%d", i);
            return 0;
        }
    }
    printf("No");
    return 0;
}