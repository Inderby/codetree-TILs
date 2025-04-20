#include <stdio.h>

int main() {
    // Please write your code here.
    char s[101];
    scanf("%s", s);
    char f = s[0], t = s[1];

    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == t)
            s[i] = f;
    }

    printf("%s", s);
    return 0;
}